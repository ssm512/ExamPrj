package prj03;
// 입력data : 예매번호,이름,영화코드,관람인원,기본요금,시간대코드
// 출력     : 예매번호,이름,영화명,총요금,할증액,최종결제금액,시간대명

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

// 총요금       = 기본요금 * 관람인원
// 할증액       = 시간대코드에 따라 총요금의 비율 적용
//               M:조조 0%, D:일반 5%, N:심야 10%
// 최종결제금액 = 총요금 + 할증액
// 영화명       = A1:액션대작, R1:로맨스극장, C1:코미디쇼, H1:공포특집
// 시간대명     = M:조조, D:일반, N:심야

// 금액은 소수이하 두자리로 반올림
// 모든 기능은 class에 구현한다.
// 인터페이스 Ipo 기능 : input(), process(), output() 기능을 반드시 포함할 것
// 선형자료구조인 ArrayList 를 사용하여 전체 데이터를 한번에 처리한다
// 자료의 순서를 최종결제금액 기준 내림차순으로 정렬하여 출력

/*
T1001,유지호,A1,2,12000.0,M
T1002,한예린,R1,3,14000.0,D
T1003,송민준,H1,1,15000.0,N
*/

interface Ipo {
	void		input();
	void		process();
	void		output();
}

class MovieVo{
	// Field
	// 입력data : 예매번호,이름,영화코드,관람인원,기본요금,시간대코드
	//				num    name  mvCode   person   charge   tCode
	// 출력     : 예매번호,이름,영화명,총요금,할증액,최종결제금액,시간대명
	//				num    name  mvName  kum   fee    totKum		tName
	
	// 입력
	private		String		num;
	private		String		name; 
	private		String		mvCode;
	private		int			person;
	private		double		charge;
	private		char		tCode;	
	// 출력
	// mvName  kum   fee    totKum		tName
	private		String		mvName;
	private		double		kum;
	private		double		fee;
	private		double		totKum;
	private		String		tName;
	//Constructor
	public MovieVo(String num, String name, String mvCode, int person, double charge, char tCode) {
		this.num = num;
		this.name = name;
		this.mvCode = mvCode;
		this.person = person;
		this.charge = charge;
		this.tCode = tCode;
	}
	//method
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
	public String getMvCode() {
		return mvCode;
	}
	public void setMvCode(String mvCode) {
		this.mvCode = mvCode;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public char gettCode() {
		return tCode;
	}
	public void settCode(char tCode) {
		this.tCode = tCode;
	}
	public String getMvName() {
		return mvName;
	}
	public void setMvName(String mvName) {
		this.mvName = mvName;
	}
	public double getKum() {
		return kum;
	}
	public void setKum(double kum) {
		this.kum = kum;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getTotKum() {
		return totKum;
	}
	public void setTotKum(double totKum) {
		this.totKum = totKum;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	//toString
	@Override
	public String toString() {
		return "movieVo [num=" + num + ", name=" + name + ", mvCode=" + mvCode + ", person=" + person + ", charge="
				+ charge + ", tCode=" + tCode + ", mvName=" + mvName + ", kum=" + kum + ", fee=" + fee + ", totKum="
				+ totKum + ", tName=" + tName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mvCode, mvName, tCode, tName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieVo other = (MovieVo) obj;
		return Objects.equals(mvCode, other.mvCode) && Objects.equals(mvName, other.mvName) && tCode == other.tCode
				&& Objects.equals(tName, other.tName);
	}
}

class MvReserve implements Ipo {
	
	List<MovieVo> 	movieList	=	new ArrayList<>();

	@Override
	public void input() {
		Scanner	in	=	new	Scanner(System.in);
		System.out.println("예매번호 이름 영화코드 관람인원 기본요금 시간대코드");
		/*
		T1001,유지호,A1,2,12000.0,M
		T1002,한예린,R1,3,14000.0,D
		T1003,송민준,H1,1,15000.0,N
		*/
		// 입력data : 예매번호,이름,영화코드,관람인원,기본요금,시간대코드
		//				num    name  mvCode   person   charge   tCode
		int		i	=	0;
		while (true) {
			String		line	=	in.nextLine();
			if (line.equals("quit") ) {
				System.out.println();
				break;
			}
			String	[]	li		=	line.trim().split(",");
			String		num		=	li[0].trim();
			String		name	=	li[1].trim();
			String		mvCode	=	li[2].trim();	
			int			person	=	Integer.parseInt(li[3].trim());
			double		charge	=	Double.parseDouble(li[4].trim());
			char		tCode	=	li[5].toUpperCase().charAt(0);
			MovieVo	movieVo	=	new	MovieVo(num, name, mvCode, person, charge, tCode);
			movieList.add(movieVo);
			System.out.println(movieList.get(i));
			i++;
		}
		
		
	}// input() end

	@Override
	public void process() {

		// 총요금       = 기본요금 * 관람인원
		// 할증액       = 시간대코드에 따라 총요금의 비율 적용
		//		               M:조조 0%, D:일반 5%, N:심야 10%
		// 최종결제금액 = 총요금 + 할증액
		// 영화명       = A1:액션대작, R1:로맨스극장, C1:코미디쇼, H1:공포특집
		// 시간대명     = M:조조, D:일반, N:심야
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
	
} 

public class MovieReserve {

	public static void main(String[] args) {
		
		MvReserve mvReserve	=	new	MvReserve ();
		mvReserve.input();
		mvReserve.process();
		mvReserve.output();
		

	} // main end

} // class MovieReserve end
