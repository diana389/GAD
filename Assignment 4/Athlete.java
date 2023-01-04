package Assignment4;

public class Athlete implements Comparable {
    private final int athleteNumber;
    private final String athleteName;
    private final String countryCode;
    private int skiTimeResultMin, skiTimeResultSec;
    private final String firstShootingRange;
    private final String secondShootingRange;
    private final String thirdShootingRange;

    public int getSkiTimeResultMin() {
        return skiTimeResultMin;
    }

    public int getSkiTimeResultSec() {
        return skiTimeResultSec;
    }

    public Athlete(int athleteNumber, String athleteName, String countryCode, int skiTimeResultMin, int skiTimeResultSec, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResultMin = skiTimeResultMin;
        this.skiTimeResultSec = skiTimeResultSec;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    @Override
    public String toString() {
        return athleteName + " " + skiTimeResultMin + ":" + skiTimeResultSec;
    }

    public void calculateFinalSkiTimeResult() {

        for (int i = 0; i < firstShootingRange.length(); i++) {
            if (firstShootingRange.charAt(i) == 'o') {
                skiTimeResultSec += 10;
            }
        }

        for (int i = 0; i < secondShootingRange.length(); i++) {
            if (secondShootingRange.charAt(i) == 'o') {
                skiTimeResultSec += 10;
            }
        }

        for (int i = 0; i < thirdShootingRange.length(); i++) {
            if (thirdShootingRange.charAt(i) == 'o') {
                skiTimeResultSec += 10;
            }
        }

        while (skiTimeResultSec > 60) {
            skiTimeResultMin += 1;
            skiTimeResultSec -= 60;
        }
    }

    @Override
    public int compareTo(Object o) {
        if (this.skiTimeResultMin - ((Athlete) o).getSkiTimeResultMin() != 0)
            return this.skiTimeResultMin - ((Athlete) o).getSkiTimeResultMin();
        else return this.skiTimeResultSec - ((Athlete) o).getSkiTimeResultSec();
    }
}
