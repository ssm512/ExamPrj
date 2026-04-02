package ex01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Ipo {
	void		input();
	void		process();
	void		output();
} // interface Ipo end

class BookVo {
	// Field
	// 입력
	private	String		num;		
	private	String		name;
	private	String		bookName; 
	private	String		entDay;
	private	String		turnDay;
	private	char		mCode;
	//출력
	private	int			ingDay;
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
	public int getIngDay() {
		return ingDay;
	}
	public void setIngDay(int ingDay) {
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
			} // if end
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
		} //while end
		
	} // input() end

	@Override
	public void process() {
		LocalDate	today	=	LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		for (int i = 0; i < bookList.size(); i++) {
			BookVo vo				=	bookList.get(i);
			String	entDay			=	vo.getEntDay();	
			LocalDate entDay2 		= LocalDate.parse(entDay, formatter);
			long days = ChronoUnit.DAYS.between(today, entDay2);
			//System.out.println(entDay2);
			//System.out.println(today);
			//System.out.println(days);
			int		day				=	(int)days;
			vo.setIngDay(day);
			if ( vo.getIngDay() <= 7 ) { vo.setEntGrade("정상"); }
			if ( vo.getIngDay() >=8 && vo.getIngDay()<=14 ) { vo.setEntGrade("주의");}
			if ( vo.getIngDay() >= 15 ) { vo.setEntGrade("연체"); }
			switch ( vo.getmCode() ) {
			case 'A': vo.setmName("일반회원"); break;
			case 'B': vo.setmName("우수회원"); break;
			case 'C': vo.setmName("특별회원"); break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + vo.getmCode());
			} // switch end
		} // for end
	} // process() end

	@Override
	public void output() {
		String title = "회원번호 이름 도서명 대출일수 대출등급 회원구분명";
		System.out.println(title);

		for (BookVo bookVo : bookList) {
			String fmt = "%s %s %s %d %s %s\n";
			System.out.printf(fmt, bookVo.getNum(), bookVo.getName(), bookVo.getBookName(), bookVo.getIngDay(), bookVo.getEntGrade(), bookVo.getmName());
			//System.out.println(bookVo.getIngDay());
		} // for end
	} // output() end
	
} // class BookRes end

public class TestBook {

	public static void main(String[] args) {
		
		BookRes bookRes	=	new	BookRes();
		bookRes.input();
		bookRes.process();
		bookRes.output();

	}

}
