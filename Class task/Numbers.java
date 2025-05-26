import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first numbers: ");
	int num1 = input.nextInt();

	System.out.print("Enter second numbers: ");
	int num2 = input.nextInt();

	System.out.print("Enter third numbers: ");
	int num3 = input.nextInt();

	System.out.print("Enter fourth numbers: ");
	int num4 = input.nextInt();

	System.out.print("Enter fifth numbers: ");
	int num5 = input.nextInt();

	int even = 0;
	int odd = 0;

	if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
	System.out.println("The largest number is " + num1);

}	else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
	System.out.println("The largest number is " + num2);

} 	else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
	System.out.println("The largest number is " + num3);

}	else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
	System.out.println("The largest number is " + num4);

}	else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
	System.out.println("The largest number is " + num5);
}
	if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
	System.out.println("The smallest number is " + num1);

}	else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
	System.out.println("The smallest number is " + num2);

}	else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
	System.out.println("The smallest number is " + num3);

}	else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
	System.out.println("The smallest number is " + num4);

}	else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
	System.out.println("The smallest number is " + num5);
}

	if (num1 % 2 == 0) {
	even = even + num1;
}
	if (num2 % 2 == 0) {
	even = even + num2;
}	
	if (num3 % 2 == 0) {
	even = even + num3;
}
	if (num4 % 2 == 0) {
	even = even + num4;
}
	if (num5 % 2 == 0) {
	even = even + num5;
}	
	int average = even / 2;	
	
	System.out.printf("The average is " + "%d", average);

}
}