public class Performer {
    private String artistName;
    private String genre;
    private Dancer d[] = new Dancer[2];

    public Performer(String artistName, String genre, Dancer d[]) {
        this.artistName = artistName;
        this.genre = genre;
        for (int i = 0; i < 2; i++) {
            this.d[i] = d[i];
        }
    }

    public void setPerformer(String artistName, String genre) {
        this.artistName = artistName;
        this.genre = genre;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }

    public Dancer[] getDancers() {
        return d;
    }

    public String toString() {
        return "Artist Name: " + artistName + "\nGenre: " + genre + "\nDancers: " + d[0].getDancerName() + ", "
                + d[1].getDancerName();
    }
}
