import java.util.Scanner;

public class TenValidScores {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- GRADE CHECKER -_ ");

	int score = 1;
	int valid = 0;
	int invalid = 0;
	int A = 0; 
	int B = 0; 
	int C = 0;
	int D = 0;
	int F = 0;
		
	do {
	System.out.print("\nEnter a valid Score: ");
	score = input.nextInt();

	if (score <= 0 || score > 100) {
	System.out.println("Invalid input!!");
	invalid++;

}	else if (score >= 0 && score <= 100){
	
	switch (score / 10) {
	case 8, 9, 10: System.out.println("A"); A++; break;
	case 7: System.out.println("B"); B++; break;
	case 6: System.out.println("C"); C++; break;
	case 5: System.out.println("D"); D++; break;
	case 0, 1, 2, 3, 4: System.out.println("F"); F++; break;
	default: System.out.println("Incorrect grade input..");
	}

	score++;
	valid++;
    }
	
}
	while (valid != 10);

	System.out.println("\nTotal grade A = " + A);
	System.out.println("Total grade B = " + B);
	System.out.println("Total grade C = " + C);
	System.out.println("Total grade D = " + D);
	System.out.println("Total grade F = " + F);
	System.out.println("Total valid inputs = " + valid);
	System.out.println("Total invalid inputs = " + invalid);
	System.out.println("Thank you..");


}




}