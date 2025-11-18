package assignments;

public class VowelCount {

	import java.util.Scanner;

	public static void main(String[] args) {

	    // Variables
	    String word = "";
	    int numVowels = 0;
	    Scanner sc = new Scanner(System.in);

	    // Input
	    System.out.println("Please enter a word:");
	    word = sc.nextLine();

	    // Processing
	    numVowels = countVowels(word);

	    // Output
	    System.out.print("The word " + word + " contains " + numVowels + " vowels");
	}
	
	// Method goes here

}
