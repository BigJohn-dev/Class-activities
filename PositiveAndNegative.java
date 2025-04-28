import java.util.Scanner;

public class PositiveAndNegative {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int total = 0;
	int num = -1;
	int numbers = 0;
	int positive = 0;
	int negative = 0;

	do {
	System.out.print("Enter an integer, the input ends if it is 0: ");
	numbers = input.nextInt();
	++num;

	if (numbers > 0) {
	positive++;

}	else if (numbers < 0) {
	negative++;
}
	total = total + numbers;
	
}	
	while (numbers != 0);
	

	System.out.println("\nThe number of positive is = " + positive);
	System.out.println("The number of negative is = " + negative);
	System.out.println("The total is = " + total);
	
	double average = (double)total / num;

	System.out.println("The average is = " + average);

}

}