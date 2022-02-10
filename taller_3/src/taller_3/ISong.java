package taller_3;


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
     * print Songs by filtered genre
     */
    void filterByGenre();
    
    /**
     * Method to filter songs by year
     */
    void filterByYear();
    
    /**
     * Method to sort songs by duration
     * Print Songs sorted in ascending order of duration
     */
    void orderByDuration();
    
    /**
     * Method to sort songs by date
     * Print Songs sorted by date ascendingly
     */
    void orderByDate();
    
    /**
     * Method to create playlist of specific songs
     * Print Songs of the created playlist
     */
    void newPlaylistWithSongs();

}
