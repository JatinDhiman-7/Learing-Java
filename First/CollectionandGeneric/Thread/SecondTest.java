package Thread;

	public class SecondTest extends Thread {
		
		//second task
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					System.out.printf("%d$ \n",i);
				}
				System.out.printf("\n %s $ task complete",Thread.currentThread().getName());
			}
	
		
}
