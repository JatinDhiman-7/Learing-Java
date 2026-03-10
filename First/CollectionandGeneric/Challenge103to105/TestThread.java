
package Challenge103to105;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThread {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(2);
//	    Thread103 task1=new Thread103();
//	    Thread103 task2=new Thread103();
//	    Thread103 task3=new Thread103();
//	    Thread103 task4=new Thread103();
//	    
//	     service.submit(task1);
//	     service.submit(task2);
//	     service.submit(task3);
//	     service.submit(task4);
		for(int i=0;i<10;i++) {
			Thread103 task= new Thread103();
			service.submit(task);
		}
	    
		try {
			if(!service.awaitTermination(10,TimeUnit.SECONDS));
			service.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
