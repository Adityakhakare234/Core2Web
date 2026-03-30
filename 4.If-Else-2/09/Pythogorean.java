import java.util.*;

class Pythogorean {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a :");
		float length1 = sc.nextFloat();

		System.out.println("Enter the value of b :");
		float length2 = sc.nextFloat();

		System.out.println("Enter the value of c :");
		float length3 = sc.nextFloat();

		if (length1 * length1 + length2 * length2 == length3 * length3 || length1 * length1 + length3 * length3 == length2 * length2 || length2 * length2 + length3 * length3 == length1 * length1) {
		
			System.out.println("Given Trio of Triangle is Pythogrean Triplet");
		} else {
		
			System.out.println("Given Trio of Triangle is not Pythogrean Triplet");
		}
	}
}
