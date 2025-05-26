import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
	
	System.out.println(" _- WELCOME TO GUESSING GAME -_");
	System.out.println("Enter any digit to guess what's on the Computer's mind...");

	Scanner input = new Scanner(System.in);
	Random picks = new Random();
	int randomPicks = picks.nextInt(0, 11);

	System.out.println("Enter any number from 1 to 10: ");
	int number = input.nextInt();

	if (number < 0 && number > 10) {
	System.out.println("Invalid input");

}	else if (number == randomPicks) {
	System.out.println("You are correct!!");

}	else if(number < randomPicks) {
	System.out.println("Number is too low");

}	else if(number > randomPicks) {
	System.out.println("Number is too high");
}		

	System.out.println("Enter any number from 1 to 10: ");
	int number2 = input.nextInt();

	if (number2 < 0 && number2 > 10) {
	System.out.println("Invalid input");

}	else if (number2 == randomPicks) {
	System.out.println("You are correct!!");

}	else if(number2 < randomPicks) {
	System.out.println("Number is too low");

}	else if(number2 > randomPicks) {
	System.out.println("Number is too high");
}		

	System.out.println("Enter any number from 1 to 10: ");
	int number3 = input.nextInt();

	if (number3 < 0 && number3 > 10) {
	System.out.println("Invalid input");

}	else if (number3 == randomPicks) {
	System.out.println("You are correct!!");

}	else if(number3 < randomPicks) {
	System.out.println("Number is too low");

}	else if(number3 > randomPicks) {
	System.out.println("Number is too high");
}		

}
}