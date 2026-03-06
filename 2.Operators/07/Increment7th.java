 class Increment7th {
 	
	 public static void main(String[] args) {
	 
		int x = 19;

		int result = x++ + x++;
		System.out.println("Result is :" +(result));
		System.out.println("The Value of x is :" +x);

		int result2 = ++x + x++ + ++x;
		System.out.println("The Result2 is " +(result2));
		System.out.println("The Value of x is :" +x);
	 }
 }
