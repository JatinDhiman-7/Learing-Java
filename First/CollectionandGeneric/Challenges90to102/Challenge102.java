package Challenges90to102;

public class Challenge102 {

	public static void main(String[] args) throws InterruptedException {
		Traffic red=new Traffic(TrafficColor.RED);
		Traffic yellow=new Traffic(TrafficColor.YELLOW);
		Traffic green=new Traffic(TrafficColor.GREEN);
		
		red.start();
		red.join();
		yellow.start();
		yellow.join();
		green.start();
		green.join();
		
	}

}
