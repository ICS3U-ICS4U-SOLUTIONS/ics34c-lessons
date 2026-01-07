package lessons;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// get input
		System.out.println("Enter an integer: ");
		
		try {
			
			userInput = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println("Invalid entry.");
			System.exit(0);  // this will exit the program if you want
		}
		
		
		
		

	}

}
