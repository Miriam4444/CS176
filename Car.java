package cs175l1;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	private String model;
	private int year;
	private boolean isAvailable = true;
	private String available_for_sale;
	private double carPrice;
	
	public Car(String model, int year, boolean is_available) {
		this.model = model;
		this.year = year;
		this.isAvailable = is_available;
		this.available_for_sale = available_for_sale;
		this.carPrice = carPrice;
		
		
	}//cons.
	
	public void displayCarInformation() {
		System.out.println("Model: " + model);
		System.out.println("Year:" + year);
		System.out.println("Price: " + carPrice);
		System.out.println("The car " + available_for_sale + " available for sale.");
	}
	
	
	public void calculateTax() {
	System.out.println("Input car price: ");
	carPrice = sc.nextDouble();
	double tax = carPrice * .10;
	System.out.println("Car tax is: $" + String.format("%.2f", tax));
	}
	
	public void isAvailableForSale(boolean isAvailable) {
		this.isAvailable = isAvailable;
        System.out.println("Is the car available for sale? (true/false): ");
        isAvailable = sc.nextBoolean();
        
        if (isAvailable == false) {
			available_for_sale = "is not";
		}
		else {
			available_for_sale = "is";
		}
	}
	
}