package lessons;

public class ParametersMethods {

	public static void main(String[] args) {

		// variables
		int firstNumber = 13;
		int secondNumber = 7;
		int answer = 0;
		
		answer = addTwoNumbers(firstNumber, secondNumber);
		System.out.println(answer);
	}

	public static int addTwoNumbers(int x, int y)  {
		
		return x + y;
	}
	
}
