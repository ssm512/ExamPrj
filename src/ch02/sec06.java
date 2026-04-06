package ch02;

public class sec06 {

	public static void main(String[] args) {
		// promotion example
		// 자동 타입 변환
		// byte → shor, char → int → long → float → double
		byte		byteValue		=	10;
		int			intValue		=	byteValue;
		System.out.println("intValue: " + intValue);
		
		char		charValue		=	'가';
		intValue					=	charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue					=	50;
		long		longValue		=	intValue;
		System.out.println(longValue);
		
		longValue					=	100;
		float		floatValue		=	longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue					=	100.5f;
		double		doubleFloat		=	floatValue;
		System.out.println("doubleValue : " + doubleFloat);
	} // main end

} // class sec06 end
