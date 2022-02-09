package taller_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class playList implements ISong{
    ArrayList<newSong> playList;

    public playList(ArrayList<newSong> playList) {
        this.playList = playList;
    }

    @Override
    public void filterByGenre() {
        Scanner inputGenre = new Scanner(System.in);
        String songGenre = inputGenre.nextLine();
        for (newSong song: playList) {
            if(song.getGenre().equals(songGenre)){
                System.out.println("\n");
                song.printData();
            }
        }
        System.out.println("No se encontro ninguna coincidencia");
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
    public int[] newPlaylistWithSongs() {
        playList newPlayList = new playList(new ArrayList<>());
        int askSongs;
        Scanner inputSongs = new Scanner(System.in);
        System.out.println("Escribe cuantas canciones vas a agregar? \n"+"Luego el Id de las canciones");
        askSongs = inputSongs.nextInt();
        int[] songsToAdd = new int[5];
        for (int i = 0; i < askSongs; i++) {
           try {
            songsToAdd[i]=inputSongs.nextInt();
           } catch (Exception e) {
               System.out.println("exception: "+ e.getMessage() + " debe ser un entero no texto");
           }
        }
        for (newSong song: playList) {
            int songId = song.getId();
            if (Arrays.stream(songsToAdd).anyMatch(i -> i == songId)){
                newPlayList.playList.add(song);
            }
        }
        for(newSong song: newPlayList.playList){
            song.printData();
            System.out.print("\n--------------\n");
        }
        return songsToAdd;
    }

}

