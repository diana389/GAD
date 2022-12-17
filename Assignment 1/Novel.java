public class Novel extends Book{
    String type;

    public Novel (String name, int number_page, String type) {
        this.name = name;
        this.number_pages = number_page;
        this.type = type;
    }

    @Override
    public String toString () {
        return name + " " + number_pages + " " + type;
    }
}
