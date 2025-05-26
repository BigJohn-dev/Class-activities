import java.util.Scanner;

public class Binary2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	System.out.print("Enter another number: ");
	int number = input.nextInt();

	int sum = num + number;

	String binary = Integer.toBinaryString(sum);	

	System.out.print(sum + " to binary is " + binary);
	
}

}