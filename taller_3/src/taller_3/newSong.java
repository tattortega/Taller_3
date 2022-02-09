package taller_3;

/**
 * create a new song
 * ej:
 * newSong sg1 = new newSong(id, title, etc...);
 *
 * @version 1.0.0 02-09-2021
 * @since 1.0.0
 */
public class newSong extends Song{

    /**
     * Song constructor
     *
     * @param id          Int
     * @param title       String
     * @param releaseDate String
     * @param duration    Double
     * @param genre       String
     * @param cover       String
     * @param description String
     * @param author      Who compose the song
     * @param artist      Who sings the song
     */
    public newSong(int id, String title, String releaseDate, Double duration,
                   String genre, String cover, String description,
                   String author, String artist)
    {
        super(id, title, releaseDate, duration, genre, cover, description, author, artist);
    }

    /**
     * polymorphism
     * print song data
     */
    @Override
    void printData() {
        super.printData();
    }
}


