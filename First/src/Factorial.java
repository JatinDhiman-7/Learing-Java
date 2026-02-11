
public class Factorial {

	public static void main(String[] args) {
		Factorial fac=new Factorial();
		fac.Fac(9);
	}

	public void Fac(int n) {
		int i = 1;
		int facto = 1;
		while (i <= n) {
			facto = facto * i;
			i++;
		}
		System.out.println("Factorial of" + facto);
	}

}
