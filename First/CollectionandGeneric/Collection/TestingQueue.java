package Collection;
import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(1);
		queue.offer(2);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.remove());
		
//		for(Integer i:queue) {
//			System.out.println(i); 
		
		Utility.print(queue);
		}
	}
	
