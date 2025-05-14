package basic_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindThirdHighestSalariedEmployee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] arr = new Employee[4];
		
		arr[0] = new Employee("Anurag",5454);
		arr[1] = new Employee("Chandana",4546);
		arr[2] = new Employee("Charan",5494);
		arr[3] = new Employee("Vanajakshi",45595);
		
		
		
		Arrays.sort(arr, (Employee e1, Employee e2) -> Integer.compare(e2.getEmpSalary(), e1.getEmpSalary()));
		
		
		
		 if (arr.length >= 3) {
	            // Print the third highest salary employee
	            System.out.println("Third highest salary: " + arr[2]);
	        } else {
	            System.out.println("There are fewer than 3 employees");
	        }
			
	}

}
