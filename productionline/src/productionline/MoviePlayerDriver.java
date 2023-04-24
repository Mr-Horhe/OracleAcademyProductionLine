package productionline;

public class MoviePlayerDriver {
	public static void main(String [] args) {
		Screen sc = new Screen("600x400",40,22);
		MoviePlayer mp = new MoviePlayer("SamsungTV", MonitorType.LED ,sc);
		System.out.println(mp);
	}
}
