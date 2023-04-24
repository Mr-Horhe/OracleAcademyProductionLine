package productionline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Driver {
	public static void main(String [] args) {
		AudioPlayer ap = new AudioPlayer("Apple iPod", "mp5");
		//ap.play();
		//ap.stop();
		//System.out.println(ap);
		Screen sc = new Screen("600x400",40,22);
		MoviePlayer mp = new MoviePlayer("SamsungTV", MonitorType.LCD ,sc);
		//System.out.println(mp);
		
		AudioPlayer ap1 = new AudioPlayer("SamsungPlay", "mp3");
		MoviePlayer mp1 = new MoviePlayer("MacintoshHD", MonitorType.LED ,sc);
		List<Product> list = new ArrayList<>(Arrays.asList(ap, ap1, mp, mp1));
		System.out.println("Input:\n");
		print(list);
		Collections.sort(list);
		System.out.println("Sorted:\n");
		print(list);
		printType(list, AudioPlayer.class);
		
	}
	
	public static void print(List<Product> list) {
		for(Product prod : list) {
			System.out.println(prod + "\n");
		}
	}
	
	public static void printType(List<? extends Product> arr, Class classname) {
		for (int i = 0; i < arr.size(); i++) {
			if (classname.isInstance(arr.get(i))) {
				System.out.println(arr.get(i));
			}
		}
	}
}
