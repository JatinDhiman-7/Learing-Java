package Map;
import java.util.Map;
import java.util.HashMap;
public class TestingMap {

	public static void main(String[] args) {
		Map<String ,Integer> map=new HashMap<>();
		map.put("Jatin",34);
		map.put("Dhiman",10);
		map.put("manu",100);
		map.put("kaju",56);
		System.out.println(map.size());
		System.out.println(map.get("Jatin"));
		System.out.println(map.keySet());
		for(String key:map.keySet()) {
			System.out.printf("%s %s\n",key,map.get(key));
		}
	}

}
