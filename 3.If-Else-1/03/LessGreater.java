
import java.util.*;

class LessGreaterCheck {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int num = sc.nextInt();

		if (num > 10) {
		
			System.out.println("The Given Number " + num + " is Greater Than 10");
		} else if (num < 10) {
		
			System.out.println("The Given Number " + num + " is Less Than 10");
		} else {
		
			System.out.println("The Given Number " + num + " is Equal To 10");
		}
	}	
}
