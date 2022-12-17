public class Album extends Book{
    String paper_quality;

    public Album (String name, int number_page, String paper_quality) {
        this.name = name;
        this.number_pages = number_page;
        this.paper_quality = paper_quality;
    }

    @Override
    public String toString () {
        return name + " " + number_pages + " " + paper_quality;
    }
}
