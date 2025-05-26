import java.util.Scanner;

public class LitersOfFuel {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	double fuelPrice = 885.0;

	System.out.print("Enter your budget: ");
	double budget = input.nextDouble();

	double liters = budget / fuelPrice;

	System.out.printf("Total liters of fuel is " + liters + "l");

}


}