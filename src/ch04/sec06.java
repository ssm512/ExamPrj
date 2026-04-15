package ch04;

public class sec06 {

	public static void main(String[] args) {
		// switch expressions example
		char		grade	=	'B';
		
		switch	(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		} // switch end
		
		switch(grade) { // 실행문이 하나일 경우 case문의 중괄호를 생략할 수 있다.
		case 'A', 'a' -> System.out.println("우수 회원이다.");
		case 'B', 'b' -> System.out.println("일반 회원이다.");
		default -> System.out.println("손님");
		} // switch end
	} // main end

} // class sec06 end
