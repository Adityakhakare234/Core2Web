import java.util.*;

class VoterAge {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Age :");
		int age = sc.nextInt();

		if (age >= 18) {
		
			System.out.println("Given Age " + age + " is Valid for voting");
		} else if (age > 0 && age < 18){
		
			System.out.println("Given Age " + age + " is Valid but not able to Vote");
		} else {
		
			System.out.println("Given Age " + age + " is Not Valid ");
		}
	}
}
