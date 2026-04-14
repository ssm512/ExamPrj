package ch03;

public class sec03 {

	public static void main(String[] args) {
		// Logical Operator Example
		int			charCode		=	'A';
		if	((65<=charCode) & (charCode<=90)) {
			System.out.println("대문자이군요");
		} // if 문 end
		if ((97<=charCode)&& (charCode <= 122)) {
			System.out.println("소문자이군요");
		} // if 문 end
		if ((48<=charCode)&&(charCode<=57)) {
			System.out.println("0~9 숫자이군요");
		} // if 문 end
		
		// -------------------------------------------
		int			value			=	6;
		if	((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요.");
			
		boolean		result			=	(value%2==0) || (value%3==0);
		if (!result) {
			System.out.println("2또는 3의 배수가 아닌군요");
			}// if 문 end
		} // if 문 end
	} // main end

} // class sec03 end
