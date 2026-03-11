package Lamda;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5,6,6);
		
		int sum=0;
		for(Integer number:numbers) {
			sum+=number;
		}
		System.out.println(sum);
		
		
		int newSum=numbers.stream().reduce(0, new BinaryOperator<Integer>() {
			@Override 
			public Integer apply(Integer integer,Integer integer2) {
				return integer+integer2;
			}
		});
		System.out.printf("\n sum using reduce %d \n",newSum);
		
		int newSum2=numbers.stream().reduce(0,(a,b)->a+b);
		System.out.printf("using functional programing %d\n",newSum2);

		
		int max=numbers.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
		System.out.printf("Max using reduce is  %d\n",max);

		
				
	} 

}
