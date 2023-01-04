package Assignment3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> addressesVolei = new ArrayList<>();
        addressesVolei.add("Romania");
        addressesVolei.add("Greece");

        Hobby volei = new Hobby("volei", 2, addressesVolei);

        ArrayList<Hobby> hobbies1 = new ArrayList<>();
        hobbies1.add(volei);

        Persoana Alex = new Persoana("Matei", 19);
        Persoana Matei = new Persoana("Alex", 21);

        TreeSet<Persoana> persoane1 = new TreeSet<>(Comparator.comparing(Persoana::getName));
        TreeSet<Persoana> persoane2 = new TreeSet<>(Comparator.comparing(Persoana::getAge));

        persoane1.add(Matei);
        persoane1.add(Alex);

        persoane2.add(Matei);
        persoane2.add(Alex);

        System.out.println("First comparator:");
        for(Persoana persoana : persoane1)
            System.out.println(persoana);

        System.out.println("Second comparator:");
        for(Persoana persoana : persoane2)
            System.out.println(persoana);

        Map hashMap = new Map();
        hashMap.addPair(Matei, hobbies1);
        hashMap.addPair(Alex, hobbies1);

        System.out.println("HashMap:\n" + hashMap);
    }
}
