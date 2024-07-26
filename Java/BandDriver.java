public class BandDriver {
    public static void main(String[] args) {
        Musician musician1 = new Musician(30, "Kate", false, "Piano");
        Musician musician2 = new Musician("Dan", "Guitar");

        System.out.println(musician1);
        System.out.println(musician2);

        Band band1 = new Band(34, "Jets", true, "Trumpet", 7, "Outsiders", "Rock", "Sam", true, Band.BandType.ROCK);
        Band band2 = new Band("Stuart", "Bass", "Blues");

        System.out.println(band1);
        System.out.println(band2);

        musician1.perform();
        musician2.practice();
        band1.perform();
        band2.releaseAlbum();

        System.out.println(musician1.equals(musician2));
        System.out.println(Band.isBandLarge(band1.getNumMusicians()));
        System.out.println(band1.equals(band2));

        System.out.println(Band.getAllBands());
    }
}
