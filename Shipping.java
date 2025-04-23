/* generating a shipping cost calculator
import class Scanner
define the class name
declear the main method
declear the Scanner 
Prompt the user to gain input to display shipping cost in dollars ((int) weight of the package)
using comparison statement to compair the weight and display the price
if the weight is less than 0 and less than or equal to 1 display 3.5
if the weight is less than 1 and less than or equal to 3 display 5.5
if the weight is less than 3 and less than or equal to 10 display 8.5
if the weight is less than 10 and less than or  equal to 20 diplay 10.5
if the weight is greater than 50 display "the package cannot be shipped"
end class
**/

import java.util.Scanner;
public class Shipping{
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the weight of the package: ");
	double Weight = input.nextDouble();

	if (Weight > 0 && Weight <= 1) {
	System.out.println("The Shipping cost is $3.5");
}
	if (Weight > 1 && Weight <= 3) {
	System.out.println("The Shipping cost is $5.5");
}
	if (Weight > 4 && Weight <= 10) {
	System.out.println("The Shipping cost is $8.5");
}
	if (Weight > 11 && Weight <= 20) {
	System.out.println("The Shipping cost is $10.5");
}
	if (Weight > 21) {
	System.out.println("The package cannot be shipped");
}

}
}