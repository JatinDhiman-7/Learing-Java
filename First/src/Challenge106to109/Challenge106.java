package Challenge106to109;

import java.util.List;
import java.util.function.BinaryOperator;

public class Challenge106 {

	public static void main(String[] args) {
//		List<Integer> list=
				
	    BinaryOperator<Integer> multi=(a,b)-> a*b;	
	    int result=multi.apply(4, 5);
	    System.out.println(result);
	}

}
