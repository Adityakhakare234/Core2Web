class Increment9th {

	public static void main(String[] args) {
	
		int x = 0;
		
		int result = ++x + ++x + ++x + ++x; // Pre-Increment Operator
		System.out.println("The Result of ++x + ++x + ++x + ++x is :" +result);
		System.out.println("The value of X After step 1 is :" +x);

		int result2 = x++ + x++ + x++ + x++; // Post-Increment Operator
		System.out.println("The Result of  x++ + x++ + x++ + x++ is :" +result2);
		System.out.println("The value of X After step 1 is :" +x);
	}
}
