package taller_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		playList p1 = new playList(new ArrayList<>());
		p1.playList.add(new newSong(1,"hello you", "2009", 3.15, "pop", "helloyou.png", "about you", "jhon doe", "jhon smit"));
		p1.playList.add(new newSong(2,"among us", "2012", 2.13, "jazz", "amongus.png", "among us", "jhon doe", "celina osk"));
		p1.playList.add(new newSong(3,"tell the truth", "2005", 3.11, "rock", "tellthetruth.png", "tell the truth us", "alicio mark", "jaime toll"));
		p1.playList.add(new newSong(4,"mexico go", "2008", 4.23, "classic", "mexicogo.png", "mexico go", "carmen tinds", "sergio tusk"));
		p1.playList.add(new newSong(5,"antartica", "2011", 1.13, "pop", "antartica.png", "antartica", "luis sands", "milena cess"));

		Scanner sc = new Scanner(System.in);
		String option;
		System.out.println("Print 1 \n");

		do{
			String inputUser = sc.nextLine();
			String[] splitInputUser = inputUser.split("\\s+");
			option = splitInputUser[0];

			if (option.equals("1")){
				Scanner inputSongs = new Scanner(System.in);
				while(!inputSongs.hasNextInt()) inputSongs.next();
				int songsToAdd = inputSongs.nextInt();

				playList newPlayList = new playList(new ArrayList<>());

			}
			else if(option.equals("2")){
				String namePlayList = splitInputUser[1];
				for (newSong song: p1.playList) {
					int songId = song.getId();
					if (songId == 1){
						p1.playList.add(song);
					}
				}
			}
		}while(option.equals("1"));




		for(newSong song: p1.playList){
			song.printData();
			System.out.println("\n"+"--------------");
		}
	}

}
