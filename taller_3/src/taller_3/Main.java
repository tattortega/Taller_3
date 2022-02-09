package taller_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        playList p1 = new playList(new ArrayList<>());
        p1.playList.add(new newSong(1,"hello you", "2009", 3.15, "pop", "helloyou.png", "about you", "jhon doe", "jhon smit"));


        for(newSong song: p1.playList){
            song.printData();
            System.out.println("\n"+"--------------");
        }

    }
}
