package cs175l1;

import java.util.Scanner;

public class CarTest {
	String model;
	int year;
	boolean is_available;

	public CarTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter car model: ");
		model = sc.nextLine();
		System.out.print("Enter car year: ");
		year = sc.nextInt();
		
		Car car1 = new Car(model, year, is_available);
		
		car1.isAvailableForSale(true);
		car1.calculateTax();
		car1.displayCarInformation();
		
		sc.close();
	}
	
	public static void main(String[] args) {
		new CarTest();
		
	}

}
