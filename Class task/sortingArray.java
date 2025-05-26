import java.util.Scanner;
import java.util.Arrays;

public class sortingArray {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the element of array: ");
	int arrayNumbers = input.nextInt();

	int[] array = new int[arrayNumbers];

	for(int count = 0; count < array.length; count++) {

	System.out.print("\nEnter a number: ");
	int number = input.nextInt();

	array[count] = number;		
}
	for(int counter = 0; counter < array.length; counter++) {
	System.out.print(array[counter] + " ");
}
	int[] sortedArray = sortArray.sortingArray(array);

	System.out.println(Arrays.toString(sortedArray));

    }
}