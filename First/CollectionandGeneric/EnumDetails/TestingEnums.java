package EnumDetails;

public class TestingEnums {

	public static void main(String[] args) {
		
//		 TrafficLigth color=TrafficLigth.GREEN;
//		 color=TrafficLigth.GREEN;
//		
//		Grade grade=Grade.A;
		
//		Grade grade=Grade.valueOf("D");
//		for(Grade value:Grade.values()) {
//			System.out.println(value);
//		}
		 
//System.out.println(Challenge96.MONDAY);
//System.out.println(Challenge96.TUESDAY);
//System.out.println(Challenge96.WEDNESDAY);
//System.out.println(Challenge96.THURESDAY);
//System.out.println(Challenge96.FRIDAY);
//System.out.println(Challenge96.SATURDAY);
//System.out.println(Challenge96.SUNDAY);

//	for(Challenge96 Day: Challenge96.values()) {
//		System.out.println(Day);
//	}
		
		for (Challenge97 Day :Challenge97.values()) {
			System.out.printf("The Day is: %s and is %s \n",Day,Day.getType());
		}


	}

}
