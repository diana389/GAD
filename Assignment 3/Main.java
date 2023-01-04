package Assignment3;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("src\\Assignment3\\athlete.csv");
        AthleteCSVReader reader = new AthleteCSVReader();
        List<Athlete> athletes = reader.readAthletes(f);

        for (Athlete athlete : athletes)
            athlete.calculateFinalSkiTimeResult();

        athletes.sort(Comparator.naturalOrder());

        for (int i = 0; i < athletes.size() && i < 3; i++) {
            if (i == 0)
                System.out.println("Winner - " + athletes.get(i));
            if (i == 1)
                System.out.println("Runner-up - " + athletes.get(i));
            if (i == 2)
                System.out.println("Third Place - " + athletes.get(i));
        }
    }
}
