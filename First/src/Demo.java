
class Oops {
	public void demo() {
		System.out.println("Hii i am class");
	}

}

class Demo extends Oops {
	public void demo2() {
		System.out.println("Hii demo2");
	}
	
	public void demo() {
		
	}
	
	
	

	public static void main(String[] args) {
		Oops myDemo = new Oops();
		myDemo.demo();
	}
}