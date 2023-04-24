package productionline;

public class AudioPlayerDriver {
	public static void main(String [] args) {
		AudioPlayer ap = new AudioPlayer("Apple iPod", "mp5");
		ap.play();
		ap.stop();
		System.out.println(ap);
	}
}
