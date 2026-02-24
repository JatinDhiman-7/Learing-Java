import java.util.Scanner; 

class Circle {
	 double radiusInMn;
	 
	 Circle(double radiusInMn){
		 this.radiusInMn=radiusInMn;
		 
	 }
	 
	 double getCircumference() {
		 return 2*radiusInMn*Math.PI;
	 }
	 
	 double getArea() {
		 return Math.PI*Math.pow(radiusInMn,2);
	 }
	 
	 @Override
	 public String toString() {
		 return "Circle props:Radius in mm: "+ radiusInMn 
				 + " ,Circumference in mm: "+ getCircumference() +
				 "," + "Area in mm2: "+getArea();
	 }

	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Welcome to the world of Circle \n");
	System.out.print("Please enter your radius: ");
	double radius=input.nextDouble();
	Circle circle=new Circle(radius );
	System.out.println(circle.toString());
	
	}

}
