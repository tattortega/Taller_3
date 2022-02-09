package taller_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class playList implements ISong{
    ArrayList<newSong> playList;

    public playList(ArrayList<newSong> playList) {
        this.playList = playList;
    }

    @Override
    public String filterByGenre() {
        return null;
    }

    @Override
    public String filterByYear() {
        return null;
    }

    @Override
    public double orderByDuration() {
        
        for (newSong song : playList) {
            double order = song.getDuration();
            //playList.get(1).getDuration();
        }
        var order = playList.get(0).getDuration();
        return order;
    }

    @Override
    public String orderByDate() {
        return null;
    }

    @Override
    public playList playlist() { 
        return null; 
    }

}

