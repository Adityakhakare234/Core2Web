


class CaseCheck {

	public static void main(String[] args) {
		
		char ch = 'A';
			
		if (ch >= 'A' && ch <= 'Z') {
		
			System.out.println("Given Alpahbet " + ch + " is in UpperCase");
		} else if (ch >= 'z' && ch <= 'z') {
		
			System.out.println("Given Alphabet " + ch + " is in LowerCase");
		} else {
		
			System.out.println("Invalid Data");
		}
	}
}
