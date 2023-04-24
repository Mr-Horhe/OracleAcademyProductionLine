package productionline;

public class Screen implements ScreenSpec{
	private String resolution;
	private int refreshRate;
	private int responseTime;
	
	public Screen(String resolution, int ref, int res) {
		this.resolution = resolution;
		this.refreshRate = ref;
		this.responseTime = res;
	}
	
	@Override
	public String getResolution() {
		// TODO Auto-generated method stub
		return resolution;
	}

	@Override
	public int getRefreshRate() {
		// TODO Auto-generated method stub
		return refreshRate;
	}

	@Override
	public int getResponseTime() {
		// TODO Auto-generated method stub
		return responseTime;
	}
	
	@Override
	public String toString() {
		return "Resolution: " + resolution + "\nRefresh rate: " + refreshRate + "\nResponse time: "+responseTime;
	}
	
}
