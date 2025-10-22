package lessons;

public class Rounding {

	public static void main(String[] args) {

		// we want to round to nearest penny
		double price = 13.9695;
		
		// multiply by 100
		price = price * 100;
		
		// round to nearest ones
		price = Math.round(price);
		
		// divide by 100
		price = price / 100;
		
		// display price
		System.out.println("$" + price);
		
	}

}
