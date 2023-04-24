package productionline;

public class MoviePlayer extends Product implements MultimediaControl{
	private Screen sc;
	private MonitorType mp;
	
	public MoviePlayer(String name, MonitorType mp, Screen sc) {
		super(name);
		this.mp = mp;
		this.sc = sc;
		// TODO Auto-generated constructor stub
	}
	
	public MoviePlayer(String name,String resolution, int refreshrate, int responsetime) {
		super(name);
		mp = MonitorType.LED;
		sc = new Screen(resolution,refreshrate,responsetime);
	}
	
	@Override
	public void play() {
		System.out.println("Play movie");
		
	}
	@Override
	public void stop() {
		System.out.println("Stop movie");
		
	}
	@Override
	public void previous() {
		System.out.println("Play previous movie");
		
	}
	@Override
	public void next() {
		System.out.println("Play next movie");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nScreen characteristics:\n"+sc.toString()+"\nMonitor type: "+mp;
	}
}
