package taller_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printInstructions(){
        System.out.print("""
                Welcome to Taller 3\s
                Aqui puedes crear tu propia playlist\s
                o realizar filtros en la biblioteca principal como:\s
                filtro por genero o por año,\s
                ademas puedes ordenar por duración y fecha.\s
                Escribe 1 para crear una playlist\s
                Escribe 2 para filtrar por genero\s
                Escribe 3 para filtrar por año\s
                Escribe 4 para ordenar por duración o\s
                Escribe 5 para ordenar por fecha \s
                \s
                A continuación se muestra la biblioteca principal:\s
                \n""");

    }

	public static void main(String[] args) {

        printInstructions();

        playList mainLibrary = new playList(new ArrayList<>());
        mainLibrary.playList.add(new newSong(1,"hello you", "2009", 3.15, "pop",
                "helloyou.png", "about you", "jhon doe", "jhon smit"));
        mainLibrary.playList.add(new newSong(2,"among us", "2012", 2.13, "jazz",
                "amongus.png", "among us", "jhon doe", "celina osk"));
        mainLibrary.playList.add(new newSong(3,"tell the truth", "2005", 3.11, "rock",
                "tellthetruth.png", "tell the truth us", "alicio mark", "jaime toll"));
        mainLibrary.playList.add(new newSong(4,"mexico go", "2008", 4.23, "classic",
                "mexicogo.png", "mexico go", "carmen tinds", "sergio tusk"));
        mainLibrary.playList.add(new newSong(5,"antartica", "2011", 1.13, "pop",
                "antartica.png", "antartica", "luis sands", "milena cess"));

		for(newSong song: mainLibrary.playList){
			song.printData();
			System.out.print("\n--------------\n");
		}

		Scanner sc = new Scanner(System.in);
		String option;

		do{
			String inputUser = sc.nextLine();
			String[] splitInputUser = inputUser.split("\\s+");
			option = splitInputUser[0];

			if ("1".equals(option)){
				mainLibrary.newPlaylistWithSongs();
			}
			else if("2".equals(option)){
				for (newSong song: mainLibrary.playList) {
					int songId = song.getId();
					if (songId == 1){
						mainLibrary.playList.add(song);
					}
				}
			}
		}while("1".equals(option));
	}
}
