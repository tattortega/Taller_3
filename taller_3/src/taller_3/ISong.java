package taller_3;


import java.util.ArrayList;

/**
 * Interface to implement filtering and search methods
 *
 * Ej:
 *  class ejClass implements ISong{}
 *
 * @version 1.0.0 2022/02/09
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public interface ISong {
    
    /**
     * Method to filter songs by genre
     * prints Songs by filtered genre
     */
    void filterByGenre();
    
    /**
     * Method to filter songs by year
     * Prints Songs by filtered year
     */
    void filterByYear();
    
    /**
     * Method to sort songs by duration
     * Print Songs sorted in ascending order of duration
     */
    void orderByDuration(ArrayList<newSong> list);

    /**
     * Method to sort songs by date
     * Print Songs sorted by date ascendingly
     */
    void orderByDate(ArrayList<newSong> list);
    
    /**
     * Method to create playlist of specific songs
     * Print Songs of the created playlist
     */
    void newPlaylistWithSongs();

}
