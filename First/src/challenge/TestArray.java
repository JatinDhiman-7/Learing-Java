package challenge;

public class TestArray {
	public static void main (String[] args) {
		ArrayOperation arr= new ArrayOperation(new int[] {1,2,4});
		ArrayOperation.Statistics statistics=arr.new Statistics();
		System.out.println(statistics.mean());
	}
} 
