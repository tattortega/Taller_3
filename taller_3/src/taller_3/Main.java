package taller_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class
 * The program runs from here
 */
public class Main {

	/**
	 * Print the program instructions
	 */
    public static void printInstructions(){
        System.out.print("""
                Welcome to Taller 3\n
                Aqui puedes crear tu propia playlist\s
                o realizar filtros en la biblioteca principal como:\s
                filtro por genero o por año,\s
                ademas puedes ordenar por duración y fecha.\n
                Digite 1 para crear una playlist\s
                Digite 2 para filtrar por genero\s
                Digite 3 para filtrar por año\s
                Digite 4 para ordenar por duración \s
                Digite 5 para ordenar por fecha \s
                Digite 6 para salir del programa \s
                \s
                A continuación se muestra la biblioteca principal:\s
                \n""");

    }

	/**
	 * Create main library song -
	 * Print main library. -
	 * Executes user's input
	 * @param args console comments
	 */
	public static void main(String[] args) {

        printInstructions();

        PlayList mainLibrary = new PlayList(new ArrayList<>());
        mainLibrary.playList.add(new newSong(1,"hello you", "2020", 3.15, "pop",
                "helloyou.png", "about you", "jhon doe", "jhon smit"));
        mainLibrary.playList.add(new newSong(2,"among us", "2012", 2.13, "jazz",
                "amongus.png", "among us", "jhon doe", "celina osk"));
        mainLibrary.playList.add(new newSong(3,"tell the truth", "2005", 3.11, "rock",
                "tellthetruth.png", "tell the truth us", "alicio mark", "jaime toll"));
        mainLibrary.playList.add(new newSong(4,"mexico go", "2008", 4.23, "classic",
                "mexicogo.png", "mexico go", "carmen tinds", "sergio tusk"));
        mainLibrary.playList.add(new newSong(5,"antartica", "2011", 1.13, "pop",
                "antartica.png", "antartica", "luis sands", "milena cess"));
        mainLibrary.playList.add(new newSong(6,"in the end", "2004", 4.25, "rock",
                "intheend.png", "in the end", "chester benington", "linkin park"));
	mainLibrary.playList.add(new newSong(7,"bangarag", "2008", 3.57, "electronic",
                "bangarag.png", "bangarag", "skryllex", "skryllex"));			
	mainLibrary.playList.add(new newSong(8,"sin ti sin mi", "2014", 3.33, "pop rock",
                "sintisinmi.png", "sin ti sin mi", "bako", "the mills"));
		
		for (newSong song: mainLibrary.playList) {
			song.printData();
			System.out.print("\n--------------\n");
		}

		Scanner inputOption = new Scanner(System.in);
		String option;

		do {
			System.out.println("Digite la opción: ");
			String inputUser = inputOption.nextLine();
			String[] splitInputUser;
			splitInputUser = inputUser.split("\\s+");
			option = splitInputUser[0];

			if ("1".equals(option)) {
				mainLibrary.newPlaylistWithSongs();
			} else if ("2".equals(option)) {
				mainLibrary.filterByGenre();
			} else if ("3".equals(option)) {
                                mainLibrary.filterByYear();
                        } else if ("4".equals(option)) {
				mainLibrary.orderByDuration(mainLibrary.playList);
			} else if ("5".equals(option)) {
				mainLibrary.orderByDate(mainLibrary.playList);
			}

		} while (Integer.parseInt(option) < 6);
	}
}