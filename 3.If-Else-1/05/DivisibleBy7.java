
import java.util.*;

class Divisible {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		if (num % 7 == 0) {
		
			System.out.println("Given Number " + num + " is Divisible by 7");
		} else {
		
			System.out.println("Given Number " + num + " is not Divisible by 7");
		}
	}
}
