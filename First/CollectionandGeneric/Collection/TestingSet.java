package Collection;
import java.util.*;
//import java.util.HashSet;
public class TestingSet {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		System.out.println(names.add("Prashant"));
		System.out.println(names.add("Sanchit"));
		System.out.println(names.add("Raftaar Gaming"));
		Utility.print(names);
		System.out.println(names.add("Prashant"));
		System.out.println(names.size());
	}

}
