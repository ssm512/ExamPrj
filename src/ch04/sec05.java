package ch04;

public class sec05 {

	public static void main(String[] args) {
		// switch example
		int		num		= (int)(Math.random()*6) + 1;
		
		switch (num) {
		case	1:
			System.out.println("1번이 나왔습니다.");
			break;
		case	2:
			System.out.println("2번이 나왔습니다.");
			break;
		case	3:
			System.out.println("3번이 나왔습니다.");
			break;
		case	4:
			System.out.println("4번이 나왔습니다.");
			break;
		case	5:
			System.out.println("5번이 나왔습니다.");
			break;
		case	6:
			System.out.println("6번이 나왔습니다.");
			break;
		} // switch end
		
		int		time	=	(int)(Math.random()*4) + 8;
		
		switch(time) {
		case 	8:
			System.out.println("출근합니다");
		case 	9:
			System.out.println("회의를 합니다");
		case 	10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근합니다");
		}// switch end
	} // main end

} // class sec05 end
