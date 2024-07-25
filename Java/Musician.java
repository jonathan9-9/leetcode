public class Musician {

    protected int age;
    protected String artistName;
    protected boolean isMale;
    protected String instrumentPlayed;

    public Musician(int age, String artistName, boolean isMale, String instrumentPlayed) {
        this.age = age;
        this.artistName = artistName;
        this.isMale = isMale;
        this.instrumentPlayed = instrumentPlayed;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setInstrumentPlayed(String instrumentPlayed) {
        this.instrumentPlayed = instrumentPlayed;
    }

    public int getAge() {
        return this.age;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public boolean getIsMale() {
        return this.isMale;
    }

    public String getInstrumentPlayed() {
        return this.instrumentPlayed;
    }
}
