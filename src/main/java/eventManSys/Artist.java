package eventManSys;

public class Artist {

    private String artistName, genre, album;
    private Stage stage;

    public Artist(String artistName, String genre, String album) {
        this.artistName = artistName;
        this.genre = genre;
        this.album = album;
    }

//    Getters and Setters
    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }

    public String getAlbum() {
        return album;
    }
    
    public Stage getStage() {
        return stage;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
