import java.util.Scanner;

public class userinput {
	
	public static void main(String[] args) {
//		System.out.println("Good Moring");
//		System.out.println("*\n**\n***");
		Scanner input =new Scanner(System.in);
		String name=input.nextLine();
		System.out.println("Good Morning" + name);
		input.close();
		
		
		
	}

}
