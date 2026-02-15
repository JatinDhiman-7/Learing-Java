
public class ForEach {

	public static void main(String[] args) {
		String[] data=new String[] {
				"Ram","Shayam","Mohan","Sohan","Sita","Geeta"
		};
		printArray(data);
	}
	
//	public static void printArray(String[] array) {
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
//	}
	
	public static void printArray(String[] array) {
		for(String name:array) {
			System.out.println(name);
		}
	}


}
