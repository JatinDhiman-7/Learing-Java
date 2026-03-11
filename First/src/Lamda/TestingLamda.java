package Lamda;

public class TestingLamda {

	public static void main(String[] args) {
		
		TestingLamda test=new TestingLamda();
		int sum=test.sum(2, 4); 
		test.printString("this is the best course");
		System.out.println("Hello world!");
		
		//toprint->System.out.println(toPrint);
		//(a,b)->a+b;
		//(a,b)->{int sum=a+b System.out.println(sum)};
		
	}
 
	
	public void printString(String toprint) {
		System.out.println(toprint);
		
	}
	
	public int sum(int a,int b) {
		int sum=a+b;
		return sum; 
	}
	

}
