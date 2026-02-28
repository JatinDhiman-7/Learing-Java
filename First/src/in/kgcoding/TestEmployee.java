package in.kgcoding;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee("jatin dhiman",21,21000);
		System.out.println(employee.getEmployeeDetails());
		employee.setName("pranav");
		System.out.println(employee.getEmployeeDetails());
	}

}
