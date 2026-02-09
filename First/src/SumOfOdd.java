
public class SumOfOdd {

	public static void odd(int n) {
		int num = 0;
		int start = 1;
		while (start <= n) {
			if (start % 2 != 0) {
				num = num + start;
			}
			start++;
		}
		System.out.println("Sum of all ood Number" + num);

	}
	public static void main(String[] args) 
	{
		odd(9);

	}

}
