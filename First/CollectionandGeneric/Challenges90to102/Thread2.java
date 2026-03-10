package Challenges90to102;

	public class Thread2 extends Thread {
		 
		@Override
		public void run() {
		try {
			Thread.sleep(4000);
			System.out.printf("From inside run %s\n",
					Thread.currentThread().getState());
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		}
	
	}
