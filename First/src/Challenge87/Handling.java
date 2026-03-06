package Challenge87;
import java.util.Scanner;
public class Handling {
	

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Handling");
		int num1=input.nextInt();
		int num2=input.nextInt();
		try {
			int result=num1/num2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Error");
		}
		
	}

}
