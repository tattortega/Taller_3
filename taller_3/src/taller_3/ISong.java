package taller_3;

import java.util.ArrayList;
import java.util.List;

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
     * @return Songs by filtered genre
     */
    String filterByGenre();
    
    /**
     * Method to filter songs by year
     * @return Return songs for the leaked year
     */
    String filterByYear();
    
    /**
     * Method to sort songs by duration
     * @return Songs sorted in ascending order of duration
     */
    double orderByDuration();
    
    /**
     * Method to sort songs by date
     * @return Songs sorted by date ascendingly
     */
    String orderByDate();
    
    /**
     * Method to create playlist of specific songs
     * @return Songs of the created playlist 
     */
    playList playlist();

}
