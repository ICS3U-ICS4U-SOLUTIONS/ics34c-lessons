package lessons;
import java.util.Scanner;	// need to import

public class InputOutput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// prompt user for integer
		System.out.println("Please enter an integer: ");
		
		// get user input
		userInput = sc.nextInt();

		// test print
		System.out.println("You entered " + userInput);
		
	}

}
