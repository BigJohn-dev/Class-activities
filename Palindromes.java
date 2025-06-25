import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int temp = number;
	int reverse = 0;

	do {
	number = number * 10 + reverse;
	temp = reverse % 10;
	reverse = reverse / 10;
}
	while(temp != 0);

	if (temp == reverse) {
	System.out.print("Its a Palindrome");

}	else {
	System.out.print("it not a Palindromes");
}

}

}






