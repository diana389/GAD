package Assignment1;

public class Novel extends Book{
    String type;

    public Novel (String name, int numberPages, String type) {
        super.name = name;
        super.numberPages = numberPages;
        this.type = type;
    }

    @Override
    public String toString () {
        return super.name + " " + super.numberPages + " " + type;
    }
}
