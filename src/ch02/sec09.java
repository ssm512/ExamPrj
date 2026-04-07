package ch02;

import java.util.Scanner;

public class sec09 {

	public static void main(String[] args) {
		// scanner example
		Scanner 		sc	=	new Scanner(System.in); // Scanner type 변수 sc 선언하고 대입 연산자를 사용해서 new 연산자로 생성한 Scanner 객체를 변수에 대입한다
		System.out.println("x 값 입력 : ");
		String			sx	=	sc.nextLine(); // 변수 sc에 담긴 입력 받은 값을 string type의 변수 sx에 대입한다.
		int				x	=	Integer.parseInt(sx);	// int type의 변수 x에 string type의 변수 sx의 값은 int type으로 변환하여 대입한다.
		
		System.out.println("y 값 입 력 : ");
		String			sy	=	sc.nextLine();
		int				y	=	Integer.parseInt(sy);
		
		int				result	=	x + y;
		System.out.println("x + y = " + result);
		
		while(true) {
			System.out.println("입력 문자열 : ");
			String	data		=	sc.nextLine();
			if (data.equals("q")) {
				break;
			} // if end
			System.out.println("출력 문자열 : " + data);
			System.out.println();
		} // while end
		System.out.println("종료");
	} // main end

} // class sec09 end
