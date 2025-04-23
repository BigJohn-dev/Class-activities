import java.util.Scanner;
public class Words {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter any digit from 1 to 10: ");
	int number = input.nextInt();


	if (number < 0 && number > 10) {
	System.out.println("Invalid input. Try again!!");

}	else if (number == 1) {
	System.out.println("You entered ONE");

}	else if (number == 2) {
	System.out.println("You entered TWO");

}	else if (number == 3) {
	System.out.println("You entered THREE");

}	else if (number == 4) {
	System.out.println("You entered FOUR");

}	else if (number == 5) {
	System.out.println("You entered FIVE");

}	else if (number == 6) {
	System.out.println("You entered SIX");

}	else if (number == 7) {
	System.out.println("You entered SEVEN");

}	else if (number == 8) {
	System.out.println("You entered EIGHT");

}	else if (number == 9) {
	System.out.println("You entered NINE");

}	else if (number == 10) {
	System.out.println("You entered TEN");
}

}
}