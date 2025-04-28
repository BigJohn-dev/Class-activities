import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	String num = Integer.toBinaryString(number);
	
	System.out.println(number + " to binary is " + num);

	
}

}