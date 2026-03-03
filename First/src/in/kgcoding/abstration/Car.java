package in.kgcoding.abstration;

public class Car extends Vehicle{
	private int noOfDoors;

	public Car() {
		super(5);
	}
	
	@Override
	public void makeStartSound() {
		System.out.println("Vroomm......");
	}


}
                                                 