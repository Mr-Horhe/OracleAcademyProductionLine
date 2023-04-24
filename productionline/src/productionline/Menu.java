package productionline;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		int input;
		String AudioName, AudioSpec, MovieName, Resolution;
		int refreshrate, responsetime;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("--------------------MENU--------------------\"" + "\n1. Add new AudioPlayer"
					+ "\n2. Add new MoviePlayer" + "\n3. Print information about all products"
					+ "\n4. Print information about Audio Players only"
					+ "\n5. Print information about Movie Players only" + "\n6. Print number of products"
					+ "\n7. Exit\n--------------------------------------------");
			System.out.print("What do you want: ");
			input = sc.nextInt();
			System.out.println();
			switch (input) {
			case 1:
				Scanner cnt = new Scanner(System.in);
				Scanner ap = new Scanner(System.in);
				System.out.println("How many Audio Players you want to add?");
				int cntAp = cnt.nextInt();
				for (int i = 0; i < cntAp; i++) {
					System.out.print("Enter name of the AudioPlayer: ");
					AudioName = ap.nextLine();
					System.out.print("Enter Audio Specification: ");
					AudioSpec = ap.nextLine();
					list.add(new AudioPlayer(AudioName, AudioSpec));
				}
				break;
			case 2:
				Scanner cnt2 = new Scanner(System.in);
				
				System.out.println("How many Movie Players you want to add?");
				int cntMp = cnt2.nextInt();
				for (int i = 0; i < cntMp; i++) {
					Scanner mp = new Scanner(System.in);
					System.out.println("Enter name of the MoviePlayer: ");
					MovieName = mp.nextLine();
					System.out.println("Enter screen resolution: ");
					Resolution = mp.nextLine();
					System.out.println("Enter screen refreshrate: ");
					refreshrate = mp.nextInt();
					System.out.println("Enter screen responsetime: ");
					responsetime = mp.nextInt();
					list.add(new MoviePlayer(MovieName, Resolution, refreshrate, responsetime));
				}
				break;
			case 3:
				for (int i = 0; i < list.size(); i++)
					System.out.println(list.get(i) + "\n");
				break;
			case 4:
				for (int i = 0; i < list.size(); i++) {
					if (AudioPlayer.class.isInstance(list.get(i)))
						System.out.println(list.get(i) + "\n");
				}
				System.out.println("");
				break;
			case 5:
				for (int i = 0; i < list.size(); i++) {
					if (MoviePlayer.class.isInstance(list.get(i)))
						System.out.println(list.get(i) + "\n");
				}
				System.out.println("");
				break;
			case 6:
				if (list.size() != 0)
					System.out.println("Number of products:" + list.get(list.size() - 1).getSerialNumber());
				else
					System.out.println("Number of products: " + 0);
				System.out.println("");
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong number of function!\n");
				break;
			}

		} while (0 != 1);
	}
}
