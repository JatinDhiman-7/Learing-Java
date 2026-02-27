import java.util.Scanner;
public class GuessGame {
	Scanner input=new Scanner(System.in);
	double num=(int)(Math.random()*100)+1;
	void play() {
		System.out.print("Enter You Number");
		int usernum=input.nextInt();
	if (usernum==num) {
		System.out.println("Congrulations");
	}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Number Guessing");
			GuessGame guessGame=new GuessGame(); 
			guessGame.play();
	}

}
