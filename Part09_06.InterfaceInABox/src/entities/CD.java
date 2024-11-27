package entities;

public class CD implements Packable {
    private final String artist;
    private final String name;
    private final int publicationYear;
    private static final double DEFAULT_WEIGHT = 0.1;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return DEFAULT_WEIGHT;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + publicationYear + ")";
    }
}