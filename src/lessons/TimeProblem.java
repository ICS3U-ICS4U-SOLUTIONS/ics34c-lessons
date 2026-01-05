package lessons;

import java.util.Scanner;

public class TimeProblem {

	public static void main(String[] args) {

		// EXAMPLE:  437654
		// HOURS:	    121
		// MINUTES:      34
		// SECONDS:      14
		
		// variables
		int numberOfSeconds = 0;
		int hours = 0;
		Scanner sc = new Scanner(System.in);
		
		// 1.  Get number of seconds from the user.
		System.out.println("Time Calculator.");
		System.out.println("Enter number of seconds: ");
		numberOfSeconds = sc.nextInt();

		// 2. Calculate the number of hours.
		hours = numberOfSeconds / (60 * 60);		
		System.out.println(hours);

	}

}


/*

STEPS TO SOLVE TIME PROBLEM:  (Pseudo Code)

1. Get number of seconds from the user.

2. Calculate the number of hours.

3. Calculate the number of seconds left over.

4. Calculate the number of minutes.

5. Calculate the number of seconds (which is what's left over)

Detailed Pseudo Code:

1. Get number of seconds from the user.

2. Calculate the number of hours.

	Hours = number of seconds / (60 x 60)
	
3. Calculate the number of seconds left over.

	Number of Seconds Left over = number of seconds % 3600

4. Calculate the number of minutes.

	Minutes = Number of Seconds Left over / 60

5. Calculate the number of seconds (which is what's left over)

	Seconds = Number of Seconds Left over % 60



*/