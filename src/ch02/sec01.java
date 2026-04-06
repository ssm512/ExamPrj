package ch02;

public class sec01 {

	public static void main(String[] args) {
		// variable initialization example
		/*
		// 변수 value 선언
		int 		value;
		// 연산 결과를 변수 result의 초기값으로 대입
		int 		result		=	value + 10;
		
		System.out.println(result);
		 */
		int			hour		=	3;
		int			minute		=	5;
		System.out.println(hour + "시간" + minute + "분");
		
		int			totalMinute	=	(hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		int			x			=	3;
		int			y			=	5;
		System.out.println("x:" + x + " y:" + y);
		
		int			temp		=	x;
					x			=	y;
					y			=	temp;
		System.out.println("x:" + x + " y:" + y);
	} // main end

} // class sec01 end
