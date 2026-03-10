package Challenges90to102;

public class First extends Thread{
	
	private int threadNumber;
	
	
	@Override
	public void run() {
		System.out.printf("%s Thread Starting-%d\n",Thread.currentThread().getState(),threadNumber);
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.printf("%s Thread Ended-%d\n",Thread.currentThread().getState(),threadNumber);
	}


	public First(int threadNumber) {
		this.threadNumber = threadNumber;
	}

}
