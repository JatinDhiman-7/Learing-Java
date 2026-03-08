package EnumDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge98 {

	public static void main(String[] args) {
		Map<String,String> countrymap=new HashMap<>();
		countrymap.put("Bharat", "New Delhi");
		countrymap.put("China", "Beijing");
		countrymap.put("Pakistan","Islamabad");
		countrymap.put("SriLanka", "Columbo");
		countrymap.put("Bangladesh", "Dhaka");
		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the Country Name :");
		String Country=input.next();
		if(countrymap.containsKey(Country)) {
			System.out.printf("Capital of %s is %s",Country,countrymap.get(Country));
		}else {
			System.out.println("Sorry we don't know the capital");
		}
		
		
	}

}
