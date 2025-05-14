package basic_programs;

import java.util.Arrays;

public class SortCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car[] arr = new Car[3];
		
		arr[0] = new Car("Mahindra","Petrol");
		arr[1] = new Car("TATA","Diesel");
		arr[2] = new Car("Hyundai","CNG");
		
		Arrays.sort(arr,(Car a,Car b)->b.carName.compareTo(a.carName));
		
		for(Car c:arr) {
			
			System.out.println("Car Name: "+c.carName+"........."+"Car Type: "+c.carType);
		}
	}

}
