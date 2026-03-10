package Challenge103to105;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
public class TestingFac {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service= Executors.newFixedThreadPool(3);
		List<Future<Integer>> list=new ArrayList<>();
		for(int i=0;i<10;i++) {
			Factorial task=new Factorial(i);
			list.add(service.submit(task));
		}
		
		for(Future<Integer> future: list) {
			try {
				System.out.printf("\n Result is: %d",future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();
		
		if(!service.awaitTermination(10, TimeUnit.SECONDS)) {
			System.out.println("BOHOT HUA BUS......");
			service.shutdown();
		}
		
	
	}

}
