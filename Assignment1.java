import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//constant variables
		final double NUM1 = 35.74;
		final double NUM2 = 0.6215;
		final double NUM3 = 35.75;
		final double NUM4 = 0.4275;
		final double NUM5 = 0.16;
		
		//user and calculate variables
		double temp, speed, windTemp;
		
		//user inputs
		System.out.println("Temperature Calculator\n\nEnter the temperature in Farenheit (Must be -45<=temperature<=40): ");
		temp = input.nextDouble();
		System.out.println("Enter the wind speed (Must be 5<=wind speed<=60): ");
		speed = input.nextDouble();
		
		//calculate and display wind chill temp
		if(-45<=temp && temp<=40 && 5<=speed && speed<=60) {
			windTemp = NUM1+(NUM2*temp)-(NUM3*Math.pow(speed, NUM5))+(NUM4*temp*Math.pow(speed, NUM5));
			System.out.println("Wind Chill Temperature: "+windTemp+" Farenheit");
		}
		else
			System.out.println("ERROR: Wrong inputs try again");
		
		System.out.println("Programmer: Richard Roath");

	}

}
