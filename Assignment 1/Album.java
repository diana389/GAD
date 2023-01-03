package Assignment1;

public class Album extends Book{
    String paperQuality;

    public Album (String name, int numberPages, String paperQuality) {
        super.name = name;
        super.numberPages = numberPages;
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString () {
        return super.name + " " + super.numberPages + " " + paperQuality;
    }
}

