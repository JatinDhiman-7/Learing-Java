package Lamda;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilterAndReduce {

	public static void main(String[] args) {
		List<String> mylits= List.of("apple","banana","Mango","Cherry","date");
		System.out.println(mylits.size());
		for (String fruit:mylits) {
			System.out.println(fruit);
		}
		System.out.println("\n ");
		mylits.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String fruit) {
				System.out.println(fruit);
			}
		});
		
		System.out.println("filter \n");
		
		mylits.stream()
			.filter(fruit->fruit.endsWith("e"))
			.forEach(fruit->System.out.println(fruit));

	}

}
