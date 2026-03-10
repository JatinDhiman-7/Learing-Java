package Challenges90to102;

public class Traffic extends Thread {

	private TrafficColor color;
	
	public Traffic(TrafficColor color) {
		this.color=color;
	}
	
	@Override 
	public void run() {
		System.out.printf("%s\n",color);
		try {
			Thread.sleep(color.getOnTimeInMills());
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
