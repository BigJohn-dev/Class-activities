import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	

	System.out.print("Enter a number: ");
	int num = input.nextInt();


	int num1 = num / 2;
	int numb1 = (num / 2) % 2;

	int num2 = num1 / 2;
	int numb2 = (num1 / 2) % 2;

	int num3 = num2 / 2;
	int numb3 = (num2 / 2) % 2;

	int num4 = num3 / 1;
	int numb4 = (num3 / 1) % 1;

	System.out.print(numb1);
	System.out.print(numb2);
	System.out.print(numb3);
	System.out.print(numb4);
}

}