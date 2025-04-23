import java.util.Scanner;

public class Binary2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	System.out.print("Enter another number: ");
	int number = input.nextInt();

	int sum = num + number;

	int num1 = sum / 2;
	int numb1 = (sum / 2) % 2;

	int num2 = num1 / 2;
	int numb2 = (num1 / 2) % 2;

	System.out.print(numb1);
	System.out.print(numb2);

	if(numb2 % 2 == 1 && numb2 % 2 == 1) {
	int num3 = num / 2;
	int numb3 = (num / 2) % 2;
	System.out.print(numb3);
}
	
	
	
	
}

}