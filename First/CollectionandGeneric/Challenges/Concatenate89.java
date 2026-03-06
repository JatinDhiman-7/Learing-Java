package Challenges;

public class Concatenate89 {
	
	public static String concatenate(String ...a) {
//		System.out.print("isnide" ,a);
		StringBuilder str=new StringBuilder();
		for(String i:a) {
		 str.append(i).append("");
		}
	  return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(Concatenate89.concatenate("Hii","bye"));
	}

}
