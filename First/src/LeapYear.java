import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("check Year is Leap or Not ");
			System.out.print("Enter the year");
			int year=input.nextInt();
			 if(year%400==0) {
				System.out.println("This is the leap Year");
			}else if(year%100==0){
				System.out.println("Not a leap Year");
			}else if(year%4==0) {
				System.out.println(" leap Year");

			}

	}

}
