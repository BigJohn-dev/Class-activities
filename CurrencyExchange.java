//Generate a currency exchange application
//declear a class and name it CurrencyExchange
//declear a main method
//import Scanner
//declear the Scanner
//prompt the user to enter the exchange rate from currency in U.S.dollars to //Chinese RMB
//promt the user to enter 0 to convert from U.S.dollars to Chinese RMB and 1 to //convert Chinese RMB and U.S. dollars
//prompt the user to enter amount in U.S. dollars or Chinese RMB to convert it to //Chinese RMB or U.S. dollars
//using conditional statement 
//if user input is equal 0 print amount in Chinese RMB
//print exchange amount in U.S. dollars
//else if user enter 1 print amount in U.S. dollars
//print exchange amount in Chinese RMB
//else print "Try again!!"
//end class


import java.util.Scanner;
public class CurrencyExchange {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the currency's exchange rate from U.S. dollars to RMB: ");
	double rate = input.nextDouble();

	if(rate < 0) {
	System.out.println("TRY AGAIN!!");
}	else
	System.out.print("Enter (0) to convert to RMB and (1) to U.S. dollars: ");
	double num = input.nextDouble();
	
	if (num == 0) {  
	System.out.print("Enter amount in Chinese RMB: ");	
	double yuan = input.nextDouble();

	double Yuan = yuan / rate;
	System.out.printf("The amount in U.S. dollar is $" + "%.2f\n", Yuan);

}	else if (num == 1) {
	System.out.print("Enter amount in U.S. dollar: ");
	double dollars = input.nextDouble();

	double Dollars = dollars * rate;
	System.out.println("The amount in yuan is " + Dollars);
	
} 	else System.out.println("Try again!!");
	
	System.out.println(" ~ Thank you for using money changer ~");
	
}
}