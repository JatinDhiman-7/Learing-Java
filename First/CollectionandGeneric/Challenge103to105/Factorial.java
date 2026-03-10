package Challenge103to105;

import java.util.concurrent.Callable;
public class Factorial implements Callable<Integer> {
	private final int number;
	Factorial(int number){
		this.number=number;
	}
	
	
	
 
	@Override
	public Integer call() throws Exception{
		Thread.sleep(2000);
		if(number<=1) {
			return 1;
		}
		int result=1;
		for(int i=1;i<=number;i++) {
			result=result*i;
		}
		return result;
	}
	
	
}
