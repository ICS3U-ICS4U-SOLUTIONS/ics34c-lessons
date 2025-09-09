package Lessons;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		double myDouble = 0.0;
		String myString = "";
		
		// get integer
		System.out.println("Enter int: ");
		myInteger = sc.nextInt();
		System.out.println(myInteger);
		
		// get double
		System.out.println("Enter double: ");
		myDouble = sc.nextDouble();
		System.out.println(myDouble);
		
		// get String (use sc.next() or sc.nextLine())
		System.out.println("Enter String: ");
		myString = sc.next();
		System.out.println(myString);
		
	}

}
