import java.util.*;

class SignCheck {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number :");
                int num = sc.nextInt();

                if (num > 0) {

                        System.out.println("The Given Number " + num + " is Positive ");
                } else if (num < 0) {

                        System.out.println("The Given Number " + num + " is Negative ");
                } else {

                        System.out.println("The Given Number " + num + " is Equals To Zero ");
                }
        }
}
