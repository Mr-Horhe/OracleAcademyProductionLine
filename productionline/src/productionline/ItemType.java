package productionline;

public enum ItemType {
	Audio("AU"),
	Visual("VI"),
	AudioMobile("AM"),
	VisualMobile("VM");
	
	
	String type;
	ItemType(String type){
		this.type=type;
	}
}
