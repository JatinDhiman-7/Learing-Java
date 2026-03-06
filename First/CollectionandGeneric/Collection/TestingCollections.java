package Collection;
import java.util.*;
public class TestingCollections {

	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<>();
		numList.add(5);
		numList.add(2);
		numList.add(8);
		numList.add(-76);
		Utility.print(numList);
		Collections.sort(numList);
		Utility.print(numList);
	}

}
