public class SumMinAndMax {
	public static void main(String[] args) {

	int [] array = {8, 0, 1, 4, 9, 2};

	int sum = 0;
	for(int count = 0; count < array.length; count++) {
	sum += array[count];
}
	int[] sums = new int[array.length];

	for (int index = 0; index < array.length; index++) {
	sums[index] = sum - array[index]; 
	System.out.println("sum " + (index + 1) + " = " + sums[index]);
}
	int min = sums[0];
	int max = sums[0];
	for (int counter = 1; counter < sums.length; counter++) {
		if (sums[counter] > max) {
		max = sums[counter];
	}
		if (sums[counter] < min) {
		min = sums[counter];
	}
}
	System.out.println("The min and max = " + min + " " + max);
}
}