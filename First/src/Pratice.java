import java.util.Scanner;

public class Pratice {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("TO Calculate Permimeter of a rectangle");
	System.out.print("Enter the side a of rectangle");
	int a=input.nextInt();
	System.out.print("Enter the side b of rectangle");
	int b=input.nextInt();
	System.out.print("Enter the side c of rectangle");
	int c=input.nextInt();
	System.out.print("Enter the side d of rectangle");
	int d=input.nextInt();
	System.out.println("Please wait Calculating the Perimeter");
	int perimeter=a+b+c+d;
	System.out.println("The Permimeter :" + perimeter );
}
}
