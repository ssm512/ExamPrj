package ex01;
//입력data : 회원번호,이름,도서명,대출일,반납예정일,회원구분
//출력     : 회원번호,이름,도서명,대출일수,대출등급,회원구분명

//대출일수 = 현재날짜 기준으로 대출일로부터 지난 일수
//대출등급 = 7일 이하 정상, 8~14일 주의, 15일 이상 연체
//회원구분명 = A:일반회원, B:우수회원, C:특별회원

//날짜 형식은 yyyyMMdd
//모든 기능은 class에 구현한다.
//입력 DATA 1줄을 입력받고  결과 1줄로 출력합니다

/*
101,최수빈,자바의정석,20260110,20260117,A
102,한지호,스프링입문,20260201,20260208,B
103,오세라,파이썬기초,20260301,20260308,C
*/

interface Ipo {
	void		input();
	void		process();
	void		output();
} // interface Ipo end

class BookVo {
	//입력data : 회원번호,이름,도서명,대출일,반납예정일,회원구분
	//			num		name	bookName  	entDay  turnDay  mCode
	private	String		num;		
	private	String		name;
	private	String		bookName; 
	private	String		entDay;
	private	String		turnDay;
	private	char		mCode;
	//출력     : 회원번호,이름,도서명,대출일수,대출등급,회원구분명
	//			num		name	bookName	ingDay	entGrade	mName
	private	String		ingDay;
	private	String		entGrade;
	private	String		mName;
	
} // class BookVo end

class BookRes implements Ipo {

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
} // class BookRes end

public class TestBook {

	public static void main(String[] args) {
		

	}

}
