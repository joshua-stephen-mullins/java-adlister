import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String name;
    private int release_date;
    private float sales;
    private String genre;

    public Album() {
    }

    public Album(long id, String name, int release_date, float sales, String genre) {
        this.id = id;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
