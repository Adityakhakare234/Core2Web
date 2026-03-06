class Increment8th {
	
	public static void main(String[] args) {
	
		int x = 14;
		int y = 22;

		int result = ++x + y++;
		System.out.println("The Result of ++x + y++ is :" +result);

		int result2 = x++ + ++y + ++x + ++x;
		System.out.println("The Result of x++ + ++y + ++x + ++x is" +result2);

		int result3 = y++ + ++x + ++x;
		System.out.println("The Result of y++ + ++x + ++x is :" +result3);
		System.out.println("The Value of x is :" +x);
		System.out.println("The Value of y is :" +y);
	}
}
