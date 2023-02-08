import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.SQLException;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            List<Ad> ads = new ArrayList<>();

            while (rs.next()) {
                ads.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        ));
            }

            return ads;
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        String query = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')", ad.getUserId(),ad.getTitle(), ad.getDescription());
        Long newAdId = 0L;
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                newAdId = rs.getLong(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
        return newAdId;
    }

    public static void main(String[] args) throws SQLException {

        MySQLAdsDao test = new MySQLAdsDao(new Config());
        System.out.println(test.all());

        Ad newAd = new Ad(1, "cup", "cute cup");
        test.insert(newAd);
        System.out.println(test.all());


    }

}
