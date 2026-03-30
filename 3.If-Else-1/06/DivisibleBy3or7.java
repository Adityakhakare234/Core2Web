
import java.util.*;

class Divisible {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		if (num % 3 == 0 || num % 7 == 0) {
		
			System.out.println("The Given Number " + num + " is Divisible by 3 or 7");
		} else {
		
			System.out.println("The Given Number " + num + " is Not Divisible by 3 or 7");
		}
	}
}
