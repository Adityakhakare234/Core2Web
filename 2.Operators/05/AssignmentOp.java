class AssignmentOp {
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 5;

		System.out.println(a +=3); // a=13
		System.out.println(b-=2);  // b=3
		System.out.println(a*=2);  // a is 13 and later a becomes 26
		System.out.println(b/=3);  // b is 3 and after div b becomes 1
		System.out.println( a%=5); // a is 26 and after div... the reminder is stored in a that is 1
	}
}
