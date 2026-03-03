package exception;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Division Calculator\n");
		System.out.print("Please enter your two numbers: ");
		int first=input.nextInt();
		int second=input.nextInt();
		try {
			int[] a= new int[5];
			System.out.printf("Result is %d",a[6]);
			a[6]=first/second;
			System.out.printf("Result is %d",a[6]);
		}catch(ArithmeticException exception) {
			System.out.printf("%s, enter valid values", exception.getMessage());
//			System.out.println("Divide by zero, enter valid value");
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Array is out of bond");
		}
	}

}
