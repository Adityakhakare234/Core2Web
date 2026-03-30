import java.util.*;

class RangeCheck {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		if (num >= 1 && num <= 1000) {
		
			System.out.println("Given Number " + num + " is in Range of (1-1000)");
		} else {
		
			System.out.println("The Given Number " + num + " is not in Range of (1-1000)");
		}
	}
}
