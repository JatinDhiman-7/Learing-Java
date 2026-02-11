//
//public class Array {
//
//	public static void main(String[] args) {
//		int [] arr= {23,334,4,4343,343,343,343};
//		int i =0;
//		int sum=0;
//		while(i<arr.length) {
//			sum=sum+arr[i];
//			i++;
//		}
//		System.out.println("The Sum of the all Number in the array" + sum);
//	}
//
//
//}
/*
//
//public class Array {
//
//	public static void main(String[] args) {
//		int [] arr= {23,334,4,4343,343,343,343};
//		int i =0;
//		int sum=0;
//		while(i<arr.length) {
//			sum=sum+arr[i];
//			i++;
//		}
//		System.out.println("The Sum of the all Number in the array" + sum);
//	}
//
//
//}
*/
/*
public class Array {

	public static void main(String[] args) {
		int [] arr= {23,334,4,4343,343,343,343};
		int i =0;
		int sum=0;
		while(i<arr.length) {
			sum=(sum+arr[i])/arr.length;
			i++;
		}
		System.out.println("The Sum of the all Number in the array" + sum);
	}
}
*/

/*
 import java.util.LinkedHashMap;

public class Array {

	public static void main(String[] args) {
		int [] arr= {23,334,4,4343,343,343,343};
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int x:arr) {
			if(map.containsKey(x)) {
				map.put(x,map.get(x)+1);
			}else {
				map.put(x, 1);
			}
	}
		map.forEach((key, value) ->
	    System.out.println(key + " value is " + value)
	);

		System.out.println("The Sum of the all Number in the array" + map);
	}
}
 */


/*public class Array {

	public static void main(String[] args) {
		int [] arr= {23,334,4,43,343,343,343};
		int i=0;
		int high=arr[0];
		while(i<arr.length) {
			if(high<arr[i]) {
				high=arr[i];
			}
			i++;
		}
		System.out.println(high);
	}
		
}*/

public class Array {

	public static void main(String[] args) {
		int [] arr= {23,334,4,43,343,343,343};
		int i=0;
		int high=arr[0];
		while(i<arr.length) {
			if(high<arr[i]) {
				high=arr[i];
			}
			i++;
		}
		System.out.println(high);
	}
		
}







