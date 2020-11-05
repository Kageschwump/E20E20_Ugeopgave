package Models;

public class Artist {
    private String artistSpec;

    public String getArtistSpec() {
        return artistSpec;
    }

    public void setArtistSpec(String artistSpec) {
        this.artistSpec = artistSpec;
    }

    public Artist(String artistSpec) {
    this.artistSpec = artistSpec;
    }
}
