package Challenge103to105;

public class Thread103 extends Thread implements Runnable {
	
	//Question 103
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.printf("\n Count :%d",i+1);
//		}
//	}
	
	//Question 104
	
	@Override
	public void run() {
		System.out.printf("\n Start %s",Thread.currentThread().getName());
		try {
			Thread.sleep(getRandom()*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("\n Ended %s",Thread.currentThread().getName());
	}
	
	private int getRandom() {
		double random=Math.random()*5+ 1;
		return (int)random;
	}
	
}
