public class Main {
    public static void main(String[] args) {
        Book book1 = new Album("Album1", 100, "excellent");
        Book book2 = new Novel("Ion", 350, "psychological");
        Book book3 = new Album("Album2", 75, "good");

        Catalog catalog = new Catalog();

        catalog.add(book1);
        catalog.add(book2);
        catalog.add(book3);

        catalog.list();

        catalog.delete(book2);

        catalog.list();
    }
}