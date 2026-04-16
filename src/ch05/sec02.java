package ch05;

public class sec02 {

	public static void main(String[] args) {
		// substring example
		String ssn		=	"880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String	secondNum	=	ssn.substring(7);
		System.out.println(secondNum);

	} // main end

} // class sec02 end
