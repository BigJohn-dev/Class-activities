public class reflectionFunction {

	private String problemName;
	private String problemType;
	private boolean problemStatus;

	public reflectionProblems (String problemName, String problemType, boolean problemStatus) {
		this.problemName = problemName;
		this.problemType = problemType;
		this.problemStatus = problemStatus;
}

	private Problems() {
	problems = {};
}

	public void addProblem(String description){
	if (description.equals(this.problemName)) {
	System.out.println("This problem has been added");
}else {
	System.out.println("Successfully added");
}
}

	public void addProblem(String problemName, String problemType, boolean problemStatus){
	ReflectionCheck problem = new ReflectionCheck(String problemName, String problemType, boolean problemStatus);
	problems.append(problem);
	System.out.println("Problem added!");
}

	



	





}