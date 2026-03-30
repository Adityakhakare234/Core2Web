
import java.util.*;

class MonthCheck {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Month Number :");
		int monthNum = sc.nextInt();

		if (monthNum == 1) {
		
			System.out.println("This is January");
		} else if (monthNum == 2) {

                        System.out.println("This is February");
		} else if (monthNum == 3) {

                        System.out.println("This is March");
                } else if (monthNum == 4) {

                        System.out.println("This is April");
                } else if (monthNum == 5) {

                        System.out.println("This is May");
                } else if (monthNum == 6) {

                        System.out.println("This is June");
                } else if (monthNum == 7) {

                        System.out.println("This is Jully");
                } else if (monthNum == 8) {

                        System.out.println("This is August");
                } else if (monthNum == 9) {

                        System.out.println("This is September");
                } else if (monthNum == 10) {

                        System.out.println("This is October");
                } else if (monthNum == 11) {

                        System.out.println("This is November");
                } else if (monthNum == 12) {

                        System.out.println("This is December");
                } else {

                        System.out.println("Enter The Valid Number (1-12)");
                }
	}
}
