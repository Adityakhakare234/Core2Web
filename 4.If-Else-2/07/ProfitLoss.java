import java.util.*;

class ProfitLossCal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Selling Price :");
		float SellPrice = sc.nextFloat();

		System.out.println("Enter the Cost Price :");
		float CostPrice = sc.nextFloat();

		float result = SellPrice - CostPrice;

		if (result > 0) {
		
			System.out.println("The Profit is :" + result);
		} else {
		
			System.out.println("The Loss is :" + (-result));
		}
	}
}
