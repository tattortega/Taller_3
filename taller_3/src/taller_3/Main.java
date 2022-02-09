package taller_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        playList p1 = new playList(new ArrayList<>());
        p1.playList.add(new newSong(1,"hello you", "2009", 3.15, "pop", "helloyou.png", "about you", "jhon doe", "jhon smit"));
        p1.playList.add(new newSong(2,"among us", "2012", 2.13, "jazz", "amongus.png", "among us", "jhon doe", "celina osk"));
		p1.playList.add(new newSong(3,"tell the truth", "2005", 3.11, "rock", "tellthetruth.png", "tell the truth us", "alicio mark", "jaime toll"));
		p1.playList.add(new newSong(4,"mexico go", "2008", 4.23, "classic", "mexicogo.png", "mexico go", "carmen tinds", "sergio tusk"));
		p1.playList.add(new newSong(5,"antartica", "2011", 1.13, "pop", "antartica.png", "antartica", "luis sands", "milena cess"));

        List lista = Arrays.asList(p1);
        Collections.sort(lista);
        //Arrays.sort(p1.playList);;

        for(newSong song: p1.playList){
            song.printData();
            System.out.println("\n"+"--------------");
        }

        var order = p1.orderByDuration();
        System.out.print(order);

    }
}


