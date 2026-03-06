package Challenges;
import java.util.*;

public class Challenge92 {
	
	public static void swap(List<Integer> list,int x,int y){
//		Collections.swap(list, i, z);
		int swap=list.get(x);
		list.set(x,list.get(y));
		list.set(y, swap);
		
		
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,44,5,6,6,7,7);
//		swap(list,2,3);
		System.out.println(list);
		swap(list,2,3);
		System.out.println(list);
	}

}
