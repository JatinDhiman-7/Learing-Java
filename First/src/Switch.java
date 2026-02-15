import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Day of the week detector\n");
		System.out.print("Enter your day in number: ");
		int day=input.nextInt();
		oldSwitch(day);
		newSwitch(day);
	}
	public static void newSwitch(int day) {
		String DaysStr=switch(day){
		case 1 ->"Monday";
		case 2 ->"Tuesday";
		case 3 ->"Wednesday";
		default ->"Invalid";
		}	;
		System.out.println(DaysStr);
	}
	
	
	
	public static void oldSwitch(int day) {
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("tahala");
		}
	}

}
