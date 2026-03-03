package inheritance;

public class Vehicle {
	private int numberOfTires;
	
	public void setNumberOfTire(int numberOfTires) {
		this.numberOfTires=numberOfTires;
	}
	
	public void commute() {
		System.out.printf("I am going from place A to place B using %d tires",numberOfTires);
	}

	public static void main(String[] args) {
		
	}

}
