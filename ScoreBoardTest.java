public class ScoreBoardTest {
	public static void main(String[] args) {

	int [][] score = {
	{3, 3, 4}, 
	{9, 1, 3}
};

// printing array elements
	for(int row = 0; row < score.length; row++){
	  for (int column = 0; column < score[row].length; column++){
		System.out.print(score[row][column]+ " ");
}
	System.out.println();
}

//summing elements in array
	int total = 0;
	for(int row = 0; row < score.length; row++){
	  for (int column = 0; column < score[row].length; column++){
		total += score[row][column];
}
	System.out.println(total);
}
	
// largest sum

	int maxRow = 0;
	int indexOfMaxRow = 0;

	for (int column = 0; column < score[0].length; column++){
	maxRow += score[0][column];
}

	for(int row = 1; row < score.length; row++){
	int totalOfThisRow = 0;
	  for (int column = 0; column < score[row].length; column++){
		totalOfThisRow += score[row][column];
}
	if (totalOfThisRow > maxRow){
	maxRow = totalOfThisRow;
	indexOfMaxRow = row;
}
}
	System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

	
	char [][] answers = {
	{'A','B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'D','B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
	{'E','D', 'D', 'A', 'C', 'A', 'E', 'E', 'A', 'D'},
	{'C','B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
	{'A','B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'B','B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'B','B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	{'E','B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
};
	char [] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

	for(int i = 0; i < answers.length; i++){
	
	int correctCount = 0;
	for(int j = 0; j < answers[i].length; j++){
	if (answers[i][j] == keys[j])
	correctCount++;
}
	System.out.println("Student " + i + "'s correct count is " + correctCount);
}

}

}
