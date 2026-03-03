package Challenge83;

public class Square extends Shape{
	
	  private final double sideIcm;
	  
	  public Square(double sideIcm) {
			this.sideIcm = sideIcm;
		}
	  
	  
	  public double getSideIcm() {
		return sideIcm;
	}
	  


	  @Override
	  public double calcuateArea(){
		  return Math.pow(sideIcm, 2);
	  }
	  public static void main(String[] args) {
			
		}
	

}
