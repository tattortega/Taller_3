package taller_3;


/**
 * Basic attributes of a single song
 *
 * Ej:
 *  Song classEJ = new Song(arg...);
 *  classEJ.setProperty(value);
 *
 * @version 1.0.0 02-09-2021
 * @author Daniel Granados
 * @since 1.0.0
 *
 */
abstract class Song {
    private int id;
    private String title;
    private String releaseDate;
    private Double duration;
    private String genre;
    private String cover;
    private String description;
    private String author;
    private String artist;

    /**
     * Song constructor
     *
     * @param id Int
     * @param title String
     * @param releaseDate String
     * @param duration Double
     * @param genre String
     * @param cover String
     * @param description String
     * @param author Who compose the song
     * @param artist Who sings the song
     */
    public Song(int id, String title, String releaseDate, Double duration, String genre,
                String cover, String description, String author, String artist)
    {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        this.author = author;
        this.artist = artist;
    }

    /**
     * Getter
     * @return
     * Id of the song
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     * Id of the song
     * @param id Int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     * @return
     * Title of the song
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter
     * Title of the song
     * @param title  String
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter
     * @return
     * Release date of the song
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Setter
     * Release date
     * @param releaseDate Date
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Getter
     * @return
     * Duration of the song
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Setter
     * Duration of the song
     * @param duration Double
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * Getter
     * @return
     * Song genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Setter
     * Song genre
     * @param genre String
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Getter
     * @return
     * Song cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * Setter
     * Song cover
     * @param cover String
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Getter
     * @return
     * Song description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter
     * Song description
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter
     * @return
     * Song author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter
     * Song author
     * @param author String
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter
     * @return
     * Song artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Setter
     * Song artist
     * @param artist String
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Print data of each song
     */
    void printData(){
        System.out.printf("id: %d"+" - título: %s%n", id, title);
        System.out.printf("día de lanzamiento: %s"+" - duración: %s%n", releaseDate, duration);
        System.out.printf("género: %s"+" - caratula: %s%n", genre, cover);
        System.out.printf("descripción: %s%n",description);
        System.out.printf("autor: %s"+" - artista: %s%n", author, artist);
    }
}
