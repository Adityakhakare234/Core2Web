
import java.util.*;

class Divisible {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		if (((num % 2 == 0) && (num % 5 == 0 ) && (num % 10 == 0))) {
		
			System.out.println("The Given Number " + num + " is Divisible by 2,5 and 10");
		} else {
		
			System.out.println("The Given Number " + num + " is Not Divisible by 2,5 and 10");
		}
	}
}
