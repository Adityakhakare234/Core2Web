import java.util.*;

class Divisible {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Float Value :");
		float data = sc.nextFloat();

		if (data % 6 == 0) {
		
			System.out.println("Given Number " + data + " is Divisible by 6");
		} else {
		
			System.out.println("Given Number " + data + " is not Dovisble by 6");
		}
	}
}
