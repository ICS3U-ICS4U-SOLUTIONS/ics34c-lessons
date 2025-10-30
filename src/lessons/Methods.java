package lessons;

public class Methods {

	
	
	public static void main(String[] args) {

		System.out.println(boatyMcBoatFace(13, 7));
		
		System.out.println(boatyMcBoatFace(13.2, 7.3));
		
		nothingReturned("Mr. Wong");
		
	}
	
	
	// DESCRIPTION - Method returns larger of two integers.
	// PARAMETERS - int a, int b
	// RETURN TYPE - int
	// The line directly below is called the METHOD SIGNATURE:
	public static int boatyMcBoatFace(int a, int b)  {
		
		if (a > b)
			return a;
		
		else
			return b;
	}
	
	// DESCRIPTION - Method returns larger of two doubles.
	// PARAMETERS - double a, double b
	// RETURN TYPE - double
	// The line directly below is called the METHOD SIGNATURE:
	public static double boatyMcBoatFace(double a, double b) {
		
		if (a > b)
			return a;
		
		else
			return b;
	}
	
	
	// DESCRIPTION - Concatenates "Hello " with String parameter
	//				 and is displayed to console.
	// PARAMETERS - String s
	// RETURN TYPE - void
	public static void nothingReturned(String s)  {
		
		System.out.println("Hello " + s);
	}
	
	
	
	
	
	

}
