import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter a number: ");
	String num = input.nextLine();

	String numb = (String)num;

	if (num == num) {
	System.out.print("Its a Palindrome");

}	else {
	System.out.print("it not a Palindromes");
}

}

}