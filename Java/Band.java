import java.util.ArrayList;

public class Band extends Musician {
    // Person class will contain: age, name of artist, gender, instrumentPlayed,
    // yearsOfPlaying

    private static final int LARGE_BAND_NUM_MEMBERS = 7;

    private int numMusicians;
    private String bandName;
    private String genre;
    private String leadSingerName;
    private boolean isPerforming;
    private static ArrayList<Band> bandList = new ArrayList<>();

    public enum BandType {
        ROCK, JAZZ, BLUES, POP
    }

    private BandType bandType;

    public Band(int age,
            String artistName, boolean isMale, String instrumentPlayed, int numMusicians, String bandName, String genre,
            String leadSingerName, boolean isPerforming, BandType bandType) {
        super(age, artistName, isMale, instrumentPlayed);
        this.numMusicians = numMusicians;
        this.bandName = bandName;
        this.genre = genre;
        this.leadSingerName = leadSingerName;
        this.isPerforming = isPerforming;
        this.bandType = bandType;
        bandList.add(this);

    }

    public Band(String artistName, String instrumentPlayed, String bandName) {
        super(artistName, instrumentPlayed);
        this.bandName = bandName;
        this.numMusicians = 0;
        this.genre = "Unknown";
        this.leadSingerName = "Unknown";
        this.bandType = BandType.POP;
        bandList.add(this);
    }

    public void setNumMusicians(int numMusicians) {
        this.numMusicians = numMusicians;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLeadingSingerName(String leadSingerName) {
        this.leadSingerName = leadSingerName;
    }

    public void setIsPerforming(boolean isPerforming) {
        this.isPerforming = isPerforming;
    }

    public int getNumMusicians() {
        return numMusicians;
    }

    public String getBandName() {
        return bandName;
    }

    public String getGenre() {
        return genre;
    }

    public String getLeadSingerName() {
        return this.leadSingerName;
    }

    public boolean getIsPerforming() {
        return this.isPerforming;
    }

    public static boolean isBandLarge(int numMusicians) {
        if (numMusicians >= LARGE_BAND_NUM_MEMBERS) {
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "Band Name: " + this.bandName
                + "\n\t + Lead Singer: " + this.leadSingerName
                + "\n\t + Genre: " + this.genre
                + "\n\t + Number of Musicians: " + this.numMusicians
                + "\n\t + Band Performing(T/F): " + this.isPerforming;

        return result;
    }

}
