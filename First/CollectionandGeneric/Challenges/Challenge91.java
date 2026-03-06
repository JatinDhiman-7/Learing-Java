package Challenges;
import java.util.*;
public class Challenge91 {
	
	static void count(List<Integer> arrlist) {
		System.out.println(Collections.frequency(arrlist, 1));
		System.out.println(Collections.frequency(arrlist, 5));
	}

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,3,4,5,5,6,4,5,1);
        count(list);
	}
}
