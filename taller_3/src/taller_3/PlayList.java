package taller_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Create playlist with methods to filter or search
 * EJ:
 *   playList p1 = new playList(new ArrayList<>());
 *   p1.filterByGenre();
 *
 * @version 1.0.0 02-10-2022
 * @author Daniel Granados - Ricardo Ortega
 * @since 1.0.0
 */
public class PlayList implements ISong{
    ArrayList<newSong> playList;

    /**
     * PlayList constructor
     * @param playList ArrayList<>();
     */
    public PlayList(ArrayList<newSong> playList) {
        this.playList = playList;
    }



    /**
     * Polymorphism -
     * Filters songs by genre. -
     * Prints the coincidences.
     */
    @Override
    public void filterByGenre() {
        Scanner inputGenre = new Scanner(System.in);
        String songGenre = inputGenre.nextLine();
        int anyMatch = 0;
        for (newSong song: playList) {
            if(songGenre.equals(song.getGenre())){
                System.out.println("\n");
                song.printData();
                anyMatch +=1;
            }
        }
        if (anyMatch == 0){
            System.out.println("No se encontro ninguna coincidencia");
        }
    }

    /**
     * Polymorphism -
     * Filters songs by year. -
     * Prints the coincidences.
     */
    @Override
    public void filterByYear() {
        Scanner inputYear = new Scanner(System.in);
        String songYear = inputYear.nextLine();
        int anyMatch = 0;
        for (newSong song: playList) {
            if (songYear.equals(song.getReleaseDate())){
                System.out.println("\n");
                song.printData();
                anyMatch +=1;
            }
        }
        if (anyMatch == 0){
            System.out.println("No se encontro ninguna coincidencia");
        }
    }

    @Override
    public void orderByDuration() {
        
        for (newSong song : playList) {
            double order = song.getDuration();
            //playList.get(1).getDuration();
        }
        var order = playList.get(0).getDuration();
        //
    }

    @Override
    public void orderByDate() {
       //
    }

    /**
     * Polymorphism -
     * Create a new playList with selected songs. -
     * Prints the new playList with the new songs.
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Arrays">Array Stream()</a>
     */
    @Override
    public void newPlaylistWithSongs() {
        PlayList newPlayList = new PlayList(new ArrayList<>());
        int songsQuantity;
        Scanner inputSongs = new Scanner(System.in);
        System.out.println("Escribe cuantas canciones vas a agregar? \n"+"Luego el Id de las canciones");
        songsQuantity = inputSongs.nextInt();
        int[] songsToAdd = new int[5];
        for (int i = 0; i < songsQuantity; i++) {
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
    }
}

