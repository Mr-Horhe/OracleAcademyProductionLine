package productionline;

public class AudioPlayer extends Product implements MultimediaControl{
	private String audioSpecification;
	private ItemType mediaType;
	
	
	public AudioPlayer(String name, String audioSpecification) {
		super(name);
		this.audioSpecification = audioSpecification;
		this.mediaType=ItemType.Audio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("Playing...");
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping");
		
	}

	@Override
	public void previous() {
		System.out.println("Play previous");
		
	}

	@Override
	public void next() {
		System.out.println("Play next");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nAudio Specification: " + audioSpecification + "\nType: " + mediaType;
	}
	
}
