import java.util.*;

class GradeSystem {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Percentage :");
		float Marks = sc.nextFloat();

		if (Marks<= 100 && Marks>=90) {
		
			System.out.println("The Grade on " + Marks + " % marks should be O (Outstanding)");
		} else if (Marks >= 80 && Marks < 90) {
		
			System.out.println("The Grade on " + Marks + " % marks should be A+");
		} else if (Marks >= 70 && Marks < 80) {

                        System.out.println("The Grade on " + Marks + " % marks should be B+");
		} else if (Marks >= 55 && Marks < 70) {

                        System.out.println("The Grade on " + Marks + " % marks should be C+");
                } else if (Marks >= 40 && Marks < 55) {

                        System.out.println("The Grade on " + Marks + " % marks should be B+");
                } else {
		
			System.out.println("You Are Failed :.. Better Luck Next Time ");
		}
	}
}
