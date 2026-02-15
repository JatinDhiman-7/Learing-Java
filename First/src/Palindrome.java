import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Palindrome Checker");
		System.out.println("Enter the String to be Checked");
		String str=input.next();
		System.out.println("Your string is" + ((isPalindrome(str)?"Palindrome":"NotPalindrome")));
		
	}
	
	public static boolean isPalindrome(String str) {
		if(str.length()<=1) {
			return true;
		}
		int lastPos=str.length()-1;
		if (str.charAt(0) != str.charAt(lastPos)) {
		return false;
		}
		String newStr=str.substring(1,lastPos);
		return isPalindrome(newStr);
	}

}
