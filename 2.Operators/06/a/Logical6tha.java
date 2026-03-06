class Logical6tha {
	
	public static void main(String[] args) {
	
		int x = 10;
		int y = 11;
		
		boolean result = (++x >= y) && (x < ++y);// true && true = true.
	        System.out.println(result);	
		System.out.println(x); // 11
		System.out.println(y); // 12
	}
}
