package lessons;
import java.util.Scanner;

public class Menus {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int menuChoice = 0;
		final int EXIT_CHOICE = 4;
		double balance = 0;
		
		while(menuChoice != 4)  {
			
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Return Card");
			System.out.println("Enter choice: ");
			menuChoice = sc.nextInt();
			
			if (menuChoice == 3)  {
				
				// call balance method!!!!
				balanceMethod(balance);
			}
			
		}

	}
	
	
	
	// DESCRIPTION - Displays balance to user.
	// PARAMETERS - double a
	// RETURN  - void
	public static void balanceMethod(double a)  {
		
		System.out.println("Balance: " + a);
	}
	
	
	
	
	// DESCRIPTION - Deposits money to balance.
	// PARAMETERS - 
	// RETURN  - 
	
	
	
	
	
	// DESCRIPTION - Withdraws money from balance.
	// PARAMETERS - 
	// RETURN  - 
	
	

}
