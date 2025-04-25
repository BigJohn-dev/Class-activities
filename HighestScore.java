import java.util.Scanner;

public class HighestScore {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String name = " ";
	int count = 1;
	int grade = 0;
	int largest = 0;

	System.out.print("Enter number of Students: ");
	int num = input.nextInt();

	while (count <= num) {
	System.out.print("Enter Student's name: ");
	name = input.next();

	System.out.println("Welcome " + name);	

	System.out.println("\nEnter Student grade: ");
	grade = input.nextInt();

	if (grade > largest) {
	largest = grade;
	name += name;

}	
	count++;
}
	System.out.println(name + " has the highest grade.");
	System.out.print("The highest grade is " + largest);

}



}