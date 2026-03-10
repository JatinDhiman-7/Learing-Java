package Excuetor;
import Challenges90to102.Thread1;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service=Executors.newFixedThreadPool(2);
		
		FetchName task1=new FetchName("Jatin");
		FetchName task2=new FetchName("Manu");
		FetchName task3=new FetchName("Dhiman");
		FetchName task4=new FetchName("Dhiman");
		
		Future<String> name1=service.submit(task1);
		Future<String> name2=service.submit(task2);
		Future<String> name3=service.submit(task3);
		Future<String> name4=service.submit(task4);
		
		try {
			System.out.printf("\n Full Name is: %s",name1.get());
			System.out.printf("\n Full Name is: %s",name2.get());
			System.out.printf("\n Full Name is: %s",name3.get());
			System.out.printf("\n Full Name is: %s",name4.get());

		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service.shutdown();
		
//		for(int i=0;i<10;i++) {
//			Thread1 task=new Thread1((char)i);
//			service.submit(task);
//			
//		} 
//		
//		System.out.println("\n ***************");
//		if(!service.awaitTermination(10,TimeUnit.SECONDS)) {
//			service.shutdownNow();
//		};
//		System.out.println("\n ***************");
	}
	

}  
