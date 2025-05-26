public class Assigning {
	public static void main(String[] args) { 

	int var1 = 2;
	int var2 = 3;
	int var3 = 5;


	if(var2 != var1){
	var1 = var2;
}	
	if(var3 != var2){
	var2 = var3;
}	
 	if(var1 != var3){
	var3 = var1;
}	
	System.out.println("var1 = " + var1);
	System.out.println("var2 = " + var2);
	System.out.println("var3 = " + var3);
	
}


}