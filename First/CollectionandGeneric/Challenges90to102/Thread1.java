package Challenges90to102;

	public class Thread1 extends Thread {
		private final int threadNumber;
		
		public Thread1(int threadNumber){
			this.threadNumber=threadNumber;
		}
		
		@Override 
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.printf("Hello from Thread %d\n %s",threadNumber,
						Thread.currentThread().getName());
			}
		}
	
	}
