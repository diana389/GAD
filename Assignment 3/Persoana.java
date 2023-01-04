package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Persoana {
    String name;
    int age;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
