import java.util.Scanner;


public class Recursion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Factorial generator \n");
		System.out.print("Please enter your number: ");
		int num=input.nextInt();
//		long fact=factorialIter(num);
		long fact=factorial(num);
		System.out.println("Factorial of Your number is: "+ fact);
	}
	
	public static long factorial(int num) {
		if (num==1) {
			return 1;
		}
		return num*factorial(num-1); 
	}
	 
	
	

	public static long factorialIter(int num) {
		long result=1;
				for(int i=1;i<=num;i++) {
					result*=i;
				}
				return result;
	}
	
}
