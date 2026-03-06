package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge93 {
	
	static void reverse(List<Integer> list) {
//		for(int i=list.size()-1;i>=0;i--){
//		 System.out.println(list.get(i));
//		}
//		Collections.reverse(list);
		for(int i=0; i<list.size()/2;i++) {
			Challenge92.swap(list,i,list.size()-1-i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6);
		System.out.println(list);
		reverse(list);
		System.out.println(list);
	}
}
