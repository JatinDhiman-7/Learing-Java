package Collection;
import java.util.ArrayList;
import java.util.List;

public class TestingList {

	public static void main(String[] args) {
		List<String> strlist=new ArrayList<>();
		strlist.add("Prashant");
		strlist.add("Jain");
		strlist.add(1,"pradeep");
		strlist.remove(0);
//		strlist.add(55);
//		if(strlist.contains("Jain")) {
//			System.out.println("Jain exists");
//		}
		
			System.out.println(strlist.indexOf("Jain"));
		
		for(int i=0;i<strlist.size();i++) {
			System.out.println(strlist.get(i));	
		}
		

	}

}
