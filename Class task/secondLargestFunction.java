public class secondLargestFunction {
	public static int secondLargestIn(int [] numbers) {
	
	int firstNumber = numbers[0];
	int secondNumber = numbers[0];

	for(int i = 0; i < numbers.length; i++) {
		
	if(numbers[i] > firstNumber){
	secondNumber = firstNumber;
	firstNumber = numbers[i];
}
	if(numbers[i] != firstNumber){
	firstNumber = secondNumber;
	secondNumber = numbers[i];
}
}
	return secondNumber;	

}
}

