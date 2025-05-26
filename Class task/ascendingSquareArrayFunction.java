public class ascendingSquareArrayFunction {

	public static int[] sortingArray(int [] numbers) {

	int[] square = new int[numbers.length];

	for(int count = 0; count < numbers.length; count++){
		square[count] = numbers[count] * numbers[count];
}
	int[] result = square; 

	for (int i = 0; i < result.length - 1; i++) {

	int currentMin = result[i];
	int currentMinIndex = i;

        for (int j = i + 1; j < result.length; j++) {

	if (currentMin > result[j]) {
	     currentMin = result[j];
	     currentMinIndex = j;
}
}
	if(currentMinIndex != i) {
	result[currentMinIndex] = result[i];
	result[i] = currentMin;
}
}
  	return result;
}
}
