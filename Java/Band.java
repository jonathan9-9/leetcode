import java.util.ArrayList;

public class Band extends Musician {
    // Person class will contain: age, name of artist, gender, instrumentPlayed,
    // yearsOfPlaying

    private static final int largeBandNumMembers = 7;

    private int numMusicians;
    private String bandName;
    private String genre;
    private String leadSingerName;
    private boolean isPerforming;

    public Band(int age,
            String artistName, boolean isMale, String instrumentPlayed, int numMusicians, String bandName, String genre,
            String leadSingerName, boolean isPerforming) {
        super(age, artistName, isMale, instrumentPlayed);
        this.numMusicians = numMusicians;
        this.bandName = bandName;
        this.genre = genre;
        this.leadSingerName = leadSingerName;
        this.isPerforming = isPerforming;

    }

    ArrayList<Musician> listOfMusicians = new ArrayList<>();

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
        return this.numMusicians;
    }

    public String getBandName() {
        return this.bandName;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getLeadSingerName() {
        return this.leadSingerName;
    }

    public boolean getIsPerforming() {
        return this.isPerforming;
    }

    public static boolean isBandLarge(int numMusicians) {
        if (numMusicians >= largeBandNumMembers) {
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
