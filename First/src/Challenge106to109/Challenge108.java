package Challenge106to109;

import java.util.List;

public class Challenge108 {

	public static void main(String[] args) {
		List<String> list=List.of("Jatin","Raftar","Abhi","Op","jatindhiman","AshuPal");
		String result=list.stream()
							.filter((List)->List.length()>10)
							.reduce("",(a,b)->a+" "+b);
		System.out.println(result);
	}

}
