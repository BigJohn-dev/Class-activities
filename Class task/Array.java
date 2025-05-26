public class Array {
	public static void main(String[] args) {

	int[] array = new int [5];

	int[] numbers = {22, 51, 38, 23, 48};

	System.out.println("\nHorizontal output");
	for(int counter = 0; counter < numbers.length; counter++) {
	System.out.println(numbers[counter]);
}

	System.out.println("\nVertical output");
	for(int counter = 0; counter < numbers.length; counter++) {
	System.out.print(numbers[counter] + " ");
}

	int total = 0;
	for(int counter = 0; counter < numbers.length; counter++) {
	total += numbers[counter];
}
	
	System.out.println("\nSum of arrays is " + total);

		

}


}