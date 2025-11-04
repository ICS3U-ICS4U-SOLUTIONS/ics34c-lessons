package lessons;
import java.util.Scanner;

public class Menus {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int menuChoice = 0;
		final int EXIT_CHOICE = 4;		
		double balance = 0;
		double deposit = 0;
		double withdraw = 0;
		
		while(menuChoice != 4)  {
			
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Return Card\n");
			System.out.println("Enter choice: ");
			menuChoice = sc.nextInt();
			
			if (menuChoice == 3)  {
				
				// call balance method!!!!
				balanceMethod(balance);
			}
			
			else if (menuChoice == 1)  {
				
				deposit = 0;
				
				// ask user for amount of money to deposit 
				System.out.println("Enter amount to deposit: ");
				deposit = sc.nextDouble();
				
				balance = depositMethod(deposit, balance);
			}
			
			else if (menuChoice == 2)  {
				
				// ask user for amount of money to withdraw
				System.out.println("Enter amount to withdraw: ");
				withdraw = sc.nextDouble();
				
				balance = withdrawMethod(withdraw, balance);
				
			}
			
		}

	}
	
	
	// DESCRIPTION - Displays balance to user.
	// PARAMETERS - double a
	// RETURN  - void
	public static void balanceMethod(double a)  {
		
		System.out.println("Balance: " + a + "\n\n");
	}
	
	
	// DESCRIPTION - Deposits money to balance.
	// PARAMETERS - double a, double b
	// RETURN  - double
	public static double depositMethod(double a, double b)  {
		
		b = a + b;
		return b;
	}
	
	
	// DESCRIPTION - Withdraws money to balance.
	// PARAMETERS - double a, double b
	// RETURN  - double
	public static double withdrawMethod(double a, double b)  {
		
		b = b - a;
		return b;
	}
	
	

}
