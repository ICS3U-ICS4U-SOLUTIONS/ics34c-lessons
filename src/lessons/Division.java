package lessons;

public class Division {

	public static void main(String[] args) {
	
		// Integer division - answer is truncated
		int a = 20;
		int b = 7;
		int result;
		result = a/b;
		System.out.println(result);
		
		// Real division - must use doubles
		double aa = 20.0;
		double bb = 7.0;
		double result2 = aa/bb;
		System.out.println(result2);
		
		// Modulus division
		int aaa = 20;
		int bbb = 7;
		int result3 = aaa % bbb;
		System.out.println(result3);
		
	}

}
