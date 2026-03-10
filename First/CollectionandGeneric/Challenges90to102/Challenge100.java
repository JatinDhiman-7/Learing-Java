package Challenges90to102;

	public class Challenge100 {
		
	   public static void main(String[] args) throws InterruptedException  {
		   Thread2 t1=new Thread2();
		   System.out.printf("Create the thread %s\n",t1.getState());
		   t1.start();
		   t1.join();
		   System.out.printf("Thread Finish %s",t1.getState());
	   }
	}
