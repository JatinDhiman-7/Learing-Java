package Challenges;
import java.util.*;
 class Challenge95 {

	public static void main(String[] args) {
		Set<Character> unique=new HashSet<>();
		Scanner input=new Scanner(System.in);   
		System.out.println("Please enter your string");
		String userStr=input.nextLine();
		for(char ch:userStr.toCharArray()) {
			unique.add(ch);
		}
		System.out.printf("Your string has %d unique characters",unique.size());
		
	}
 
}
