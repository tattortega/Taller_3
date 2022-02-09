package taller_3;

import java.util.ArrayList;

/**
 * Interface to implement filtering and search methods
 * @author Ricardo Ortega
 * @version 1.0.0 2022/02/09
 * @since 1.0.0
 */
public interface ISong {
    
    /**
     * Method to filter songs by genre
     * @return Songs by filtered genre
     */
    public abstract String filterByGenre();
    
    /**
     * Method to filter songs by year
     * @return Return songs for the leaked year
     */
    public abstract String filterByYear();
    
    /**
     * Method to sort songs by duration
     * @return Songs sorted in ascending order of duration
     */
    public abstract double orderByDuration();
    
    /**
     * Method to sort songs by date
     * @return Songs sorted by date ascendingly
     */
    public abstract String orderByDate();
    
    /**
     * Method to create playlist of specific songs
     * @return Songs of the created playlist 
     */
    public abstract ArrayList playlist();
}
