package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.commute();
		TwoWheeler twowheeler=new TwoWheeler();
		twowheeler.commute();
		twowheeler.balance();
		MotorCycle 	motorCycle=new 	MotorCycle();
		motorCycle.commute();
		motorCycle.balance();
		motorCycle.start();
	}

}
