package lessons;

public class IfElse {

	public static void main(String[] args) {

		int mark = 60;
		
		// level 1
		if (mark < 50)  {
			
			System.out.println("Level 0");
		}
		
		else if (mark < 60)  {
			
			System.out.println("Level 1");
		}
		
		else if (mark < 70)  {
			
			System.out.println("Level 2");
		}

		else if (mark < 80)  {
			
			System.out.println("Level 3");
		}
		
		else  {
			
			System.out.println("Level 4");
		}
	}

}
