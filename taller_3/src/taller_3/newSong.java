package taller_3;


import java.util.ArrayList;

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
    public newSong(int id, String title, String releaseDate, Double duration, String genre, String cover, String description, String author, String artist) {
        super(id, title, releaseDate, duration, genre, cover, description, author, artist);
    }

    @Override
    void printData() {
        super.printData();
    }
}


