package Challenge83;

public class TestShape {

	public static void main(String[] args) {
//		Shape shape=new Shape();
		Circle circle=new Circle(5);
		System.out.println(circle.calcuateArea());
		Square square =new Square(10.3);
		System.out.println(square.calcuateArea());

	}

}
