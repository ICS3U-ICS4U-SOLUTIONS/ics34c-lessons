package lessons;

public class Strings {

	public static void main(String[] args) {

		// variables
		int pocket = 0;
		char newPocket;
		
		// object
		String myString = "Hello World!";
		
		pocket = myString.length();
		
		newPocket = myString.charAt(3);
		
		System.out.println(newPocket);
	}

}
