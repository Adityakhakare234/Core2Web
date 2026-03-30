import java.util.*;

class Percentage {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the PERCENTAGE Value :");
		double perc = sc.nextDouble();

		if (perc >= 85.00 && perc <= 100.00) {
		
			System.out.println("For Given " + perc + " %, You Have to Choose Medical");
		} else if (perc < 85.00 && perc >= 70) {
		
			System.out.println("For Given " + perc + " %, You Have to Choose Enginnering or Pharmacy");
		} else if (perc < 70.00 && perc >= 50) {
		
			System.out.println("For Given " + perc + " %, You Have to Choose LLB or BSc's");
		} else if (perc < 50.00 && perc >=35.00) {
		
			System.out.println("For Given " + perc + " %, You Have to Choose Hotel Managemnet or B.A or B.Com");
		} else {
		
			System.out.println("Enter Valid Data");
		}
	}
}
