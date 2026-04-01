package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
	//Constructor
	public BookVo(String num, String name, String bookName, String entDay, String turnDay, char mCode) {
		this.num = num;
		this.name = name;
		this.bookName = bookName;
		this.entDay = entDay;
		this.turnDay = turnDay;
		this.mCode = mCode;
	//method
	// getter & setter
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getEntDay() {
		return entDay;
	}
	public void setEntDay(String entDay) {
		this.entDay = entDay;
	}
	public String getTurnDay() {
		return turnDay;
	}
	public void setTurnDay(String turnDay) {
		this.turnDay = turnDay;
	}
	public char getmCode() {
		return mCode;
	}
	public void setmCode(char mCode) {
		this.mCode = mCode;
	}
	public String getIngDay() {
		return ingDay;
	}
	public void setIngDay(String ingDay) {
		this.ingDay = ingDay;
	}
	public String getEntGrade() {
		return entGrade;
	}
	public void setEntGrade(String entGrade) {
		this.entGrade = entGrade;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	//toString
	@Override
	public String toString() {
		return "BookVo [num=" + num + ", name=" + name + ", bookName=" + bookName + ", entDay=" + entDay + ", turnDay="
				+ turnDay + ", mCode=" + mCode + ", ingDay=" + ingDay + ", entGrade=" + entGrade + ", mName=" + mName
				+ "]";
	}
} // class BookVo end

class BookRes implements Ipo {
	List<BookVo>	bookList	=	new	ArrayList<>();
	@Override
	public void input() {
		
		Scanner	in	=	new	Scanner(System.in);
		System.out.println("회원번호 이름 도서명 대출일 반납예정일 회원구분");
		int		i	=	0;
		while (true) {
			String line = in.nextLine();
			if (line.equals("q")) {
				System.out.println();
				break;
			}
			String[] li = line.trim().split(",");
			String num = li[0].trim();
			String name = li[1].trim();
			String bookName = li[2].trim();
			String entDay = li[3].trim();
			String turnDay = li[4].trim();
			char mCode = li[5].toUpperCase().charAt(0);
			BookVo bookVo = new BookVo(num, name, bookName, entDay, turnDay, mCode);
			bookList.add(bookVo);
			System.out.println(bookList.get(i));
			i++;
		}
	}

	@Override
	public void process() {
		/*
		101,최수빈,자바의정석,20260110,20260117,A
		102,한지호,스프링입문,20260201,20260208,B
		103,오세라,파이썬기초,20260301,20260308,C
		*/
		//입력data : 회원번호,이름,도서명,대출일,반납예정일,회원구분
		//			num		name	bookName  	entDay  turnDay  mCode
		//대출일수 = 현재날짜 기준으로 대출일로부터 지난 일수
		//대출등급 = 7일 이하 정상, 8~14일 주의, 15일 이상 연체
		//회원구분명 = A:일반회원, B:우수회원, C:특별회원

		//날짜 형식은 yyyyMMdd
		//모든 기능은 class에 구현한다.
		//입력 DATA 1줄을 입력받고  결과 1줄로 출력합니다
		//출력     : 회원번호,이름,도서명,대출일수,대출등급,회원구분명
		//			num		name	bookName	ingDay	entGrade	mName

		
	}

	@Override
	public void output() {

		
	}
	
} // class BookRes end

public class TestBook {

	public static void main(String[] args) {
		BookRes bookRes	=	new	BookRes();
		bookRes.input();
		bookRes.process();
		bookRes.output();

	}

}
