package EnumDetails;

public enum TrafficLigth {
	RED("Stop"),GREEN("Go"),YELLOW("Caution");
	
	private final String action;
	
	TrafficLigth(String action){
		this.action=action;
	}
	

}
