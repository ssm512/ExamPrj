package ch02;

public class sec03 {

	public static void main(String[] args) {
		// Boolean Example
		boolean			stop	=	true;
		if	(stop)	{ 
			System.out.println("중지합니다.");
		} // if end
		else {
			System.out.println("시작합니다");
		} // else end
		int				x		=	10;
		boolean			result1	=	( x==20 );		//	변수 x의 값이 20인가?
		boolean			result2	=	( x!=20 );		//	변수 x의 값이 20이 아닌가?
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
	} // main end

} // class sec03 end
