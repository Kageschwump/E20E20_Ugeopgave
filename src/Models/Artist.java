package Models;

public class Artist {
    private String artistSpec;
    private String name;

    public String getArtistSpec() {
        return artistSpec;
    }

    public void setArtistSpec(String artistSpec) {
        this.artistSpec = artistSpec;
    }

    public Artist(String artistSpec) {
    this.artistSpec = artistSpec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
