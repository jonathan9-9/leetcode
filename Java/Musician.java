public class Musician implements Comparable<Musician> {

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

    public Musician(String artistName, String instrumentPlayed) {
        this(0, artistName, true, instrumentPlayed);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

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
        return age;
    }

    public String getArtistName() {
        return artistName;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public String getInstrumentPlayed() {
        return instrumentPlayed;
    }

    @Override
    public String toString() {
        String s = "Musician: " + artistName + " (" + age + ", " + (isMale ? "Male" : "Female") + "), Instrument: "
                + instrumentPlayed;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Musician musician = (Musician) obj;
        return age == musician.age &&
                isMale == musician.isMale &&
                artistName.equals(musician.artistName) &&
                instrumentPlayed.equals(musician.instrumentPlayed);
    }

    @Override
    public int compareTo(Musician other) {
        return this.artistName.compareTo(other.artistName);
    }

    public void perform() {
        System.out.println(artistName + " is performing and will be playing the " + instrumentPlayed + ".");
    }

    public void practice() {
        System.out.println(artistName + " is practicing the " + instrumentPlayed + ".");
    }

}
