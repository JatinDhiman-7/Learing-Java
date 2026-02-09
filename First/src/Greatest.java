import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Give Me the Three in I tell the Greatest One!");
		System.out.print("Enter First Number :");
		int a=input.nextInt();
		System.out.print("Enter Second Number :");
		int b=input.nextInt();
		System.out.print("Enter Second Number :");
		int c=input.nextInt();
		if(a>b && a>c) {
			System.out.println("Greatest Number is" + a);
		}else if(b>c) {
			System.out.println("Greatest Number is" + b);
		}else {
			System.out.println("Greatest Number is" + c);
		}
		
	}

}
