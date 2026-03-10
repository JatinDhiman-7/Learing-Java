package Challenges90to102;

public class Challenge101 {

	public static void main(String[] args) throws InterruptedException  {
	 First f1=new First(1);
	 First f2=new First(2);
	 First f3=new First(3);
	 
	 f1.start();
	 f1.join();
	 f2.start();
	 f2.join();
	 f3.start();
	 
	 
	}

}
