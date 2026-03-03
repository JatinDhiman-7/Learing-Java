package inheritance;

public class TwoWheeler extends Vehicle {
	TwoWheeler(){
		setNumberOfTire(2);
	}
	
	public void balance() {
		System.out.print("I am balancing on two tires");
	}

	public static void main(String[] args) {
		
	}

}
