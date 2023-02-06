import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        Album threeDollarWine = new Album(1, "3dw", 2013, 21, "rap");
        Album oneWish = new Album(2, "one wish", 2018, 3, "pop");
        Album anotherOne = new Album(3, "Another ONE", 2021, 34, "Metal");

        Author joshua = new Author(1, "Joshua", "Mullins");
        Author kaylee = new Author(2, "Kaylee", "Morris");
        Author brad = new Author(3, "Brad", "Johnson");

        Quote q1 = new Quote(1, joshua, "one must do things");
        Quote q2 = new Quote(2, kaylee, "the dreadwolf");
        Quote q3 = new Quote(3, brad, "yeet");

        ArrayList<Quote> quotes = new ArrayList<Quote>() {};
        quotes.add(q1);
        quotes.add(q2);
        quotes.add(q3);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name() + " once said " + quote.getContent());
        }

    }
}
