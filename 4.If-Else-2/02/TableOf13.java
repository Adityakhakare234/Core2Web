import java.util.*;

class TableChecker {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		if (num % 13 == 0) {
		
			System.out.println("The Given Number " + num + " is in the table of 13th");
		} else {
		
			System.out.println("The Given Number " + num + " is not in the Table of 13th");
		}
	}
}
