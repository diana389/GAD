import java.util.Vector;

public class Catalog {
    Vector<Book> catalog = new Vector<>();

    void add (Book book) {
        catalog.add(book);
    }

    void delete (Book book) {
        catalog.remove(book);
    }

    void list () {
        System.out.println("Catalog:");

        for(Book book : catalog)
            System.out.println(book);

        System.out.println();
    }
}
