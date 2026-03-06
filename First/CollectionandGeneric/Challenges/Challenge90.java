package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challenge90 {
	public static void  Sort(List<String> stringlist) {
		Collections.sort(stringlist,new Comparator<String>(){
			@Override
			public int compare(String s,String t1){
				if (s.equals(t1)){
					return 0;
				}else if(s.charAt(0)<t1.charAt(0)) {
					return -1;
				}else {
					return 1;
				}
			} 
		});
	}

	public static void main(String[] args)  {
		List<String> list=Arrays.asList("Bear","Lion","Ant");
		System.out.println(list );
		Sort(list);
		System.out.println(list );
	}
}
