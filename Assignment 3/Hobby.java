package Assignment3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hobby {
    String name;
    int frequency;
    List<String> addresses = new ArrayList<>();

    public Hobby(String name, int frequency, List<String> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + addresses +
                '}';
    }
}
