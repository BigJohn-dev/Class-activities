public class arrayOfArrays {
	public static void main(String[] args) {

	char [][] array = new char [3][3];

	char[][] letters = {{'X', 'O', 'X'}, {'O', 'O', 'O'}, {'X', 'X', 'O'}};

	for (int i = 0; i < letters.length; ++i) {
		for(int j = i; j < letters.length; ++j) {

	System.out.print(letters[j][j] + " ");
}
	System.out.println(letters[i][i] + " ");
}












}


}