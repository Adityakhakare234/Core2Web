// Bitwise Operators are :- &,|,^,<<,>>,>>>
class BitwiseOp {
	
	public static void main(String[] args) {
		
		int value1 = 5; // 0101
		int value2 = 3; // 0011

		System.out.println(value1 & value2); //And 
		System.out.println(value1 | value2); //Or 
		System.out.println(value1 ^ value2); //XOR
		System.out.println(value1 << value2);// left shift 
		System.out.println(value1 >> value2);// signed right shift 
		System.out.println(value1 >>> value2);// Unsigned right shift
	}

}
