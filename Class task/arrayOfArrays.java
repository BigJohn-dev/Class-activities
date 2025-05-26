public class arrayOfArrays {
	public static void main(String[] args) {

		char [][] array = new char [3][3];

		char[][] letters = {{'X', 'O', 'X'}, {'O', 'O', 'O'}, {'X', 'X', 'O'}};

		for (int rows = 0; rows < letters.length; ++rows) {
			for(int colums = 0; colums < letters[rows].length; colums++) {

				System.out.print(letters[rows][colums] + " ");

			}
			System.out.println();
		}


		

		/*for(char rows[] : letters) {
			for (char each : rows) {

				System.out.print(each);


			}
			System.out.println();


		}*/









}


}