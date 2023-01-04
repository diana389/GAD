package Assignment3;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    HashMap<Persoana, ArrayList<Hobby>> pairs = new HashMap<Persoana, ArrayList<Hobby>>();
    public void addPair(Persoana persoana, ArrayList<Hobby> hobbies) {
        pairs.put(persoana, hobbies);
    }

    @Override
    public String toString() {
        return "Map{" + "pairs=" + pairs + '}';
    }
}
