public class Album extends Book{
    String paper_quality;

    public Album (String name, int numberPages, String paper_quality) {
        super.name = name;
        super.numberPages = numberPages;
        this.paper_quality = paper_quality;
    }

    @Override
    public String toString () {
        return name + " " + numberPages + " " + paper_quality;
    }
}
