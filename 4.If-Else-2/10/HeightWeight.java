import java.util.*;

class MyExample {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Height :");
		float height = sc.nextFloat();

		System.out.println("Enter Weight :");
		float weight = sc.nextFloat();

		if (height <= 165.00 && weight <= 85.00) {
		
			System.out.println("You Are Eligible for next Round");
		} else {
		
			System.out.println("Sorry You Are Not Eligible for Next Round");
		}
	}
}
