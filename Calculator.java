import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- THE CALCULATOR -_ ");

	while (true) {
		String Page = """
	
		Choose an option:

		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division

		""";
		System.out.println(Page);
		int num1 = input.nextInt();

	switch (num1) {
	case 1: System.out.println("Addition"); {

		int wish = 0;
 
		do {
		System.out.println("Enter a number: ");
		int one = input.nextInt();
		
		System.out.println("Enter a number: ");
		int two = input.nextInt();

		int sum = one + two;
		System.out.println("The sum is = " + sum);

		System.out.println("\nDo you wish to continue? press any number or 0 to quit: ");
		wish = input.nextInt();
	    }
		while (wish != 0); 
}break;

	case 2: System.out.println("Subtraction"); {

		int cho = 0;
 
		do {
		System.out.println("Enter a number: ");
		int three = input.nextInt();
		
		System.out.println("Enter a number: ");
		int four = input.nextInt();

		int minus = three - four;
		System.out.println("The subtraction is = " + minus);

		System.out.println("\nDo you wish to continue? press any number or 0 to quit: ");
		cho = input.nextInt();
	    }
		while (cho != 0);
}break;

	case 3: System.out.println("Multiplication"); {
		
		int sho = 0;
 
		do {
		System.out.println("Enter a number: ");
		int five = input.nextInt();
		
		System.out.println("Enter a number: ");
		int six = input.nextInt();

		int multi = five * six;
		System.out.println("The division is = " + multi);

		System.out.println("\nDo you wish to continue? press any number or 0 to quit: ");
		sho = input.nextInt();
	    }
		while (sho != 0);
}break;

	case 4: System.out.println("Division"); {

		int bho = 0;
 
		do {
		System.out.println("Enter a number: ");
		int seven = input.nextInt();
		
		System.out.println("Enter a number: ");
		int eight = input.nextInt();

		if (eight == 0) {
		System.out.println("The division is = 0");

}		else {
		double divi = seven / eight;
		System.out.println("The division is = " + divi);
}
		System.out.println("\nDo you wish to continue? press any number or 0 to quit: ");
		bho = input.nextInt();
	    }
		while (bho != 0);
}break;

	case 0: System.out.println("Have a nice day");

}

}


}
}