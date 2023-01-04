package Assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class AthleteCSVReader {
    public List<Athlete> readAthletes(Reader reader) throws IOException {

        ArrayList<Athlete> players = new ArrayList<Athlete>();
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();

        while (line != null) {
            String[] tokens = line.split(",|:");
            Athlete athlete = new Athlete(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), tokens[5], tokens[6], tokens[7]);
            players.add(athlete);
            line = bufReader.readLine();
        }

        return players;
    }
}
