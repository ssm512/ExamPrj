package prj03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

interface Ipo {
	void input();

	void process();

	void output();
} // interface Ipo end

class MovieVo {
	// Field
	// 입력
	private String num;
	private String name;
	private String mvCode;
	private int person;
	private double charge;
	private char tCode;
	// 출력
	private String mvName;
	private double kum;
	private double fee;
	private double totKum;
	private String tName;

	// Constructor
	public MovieVo(String num, String name, String mvCode, int person, double charge, char tCode) {
		this.num = num;
		this.name = name;
		this.mvCode = mvCode;
		this.person = person;
		this.charge = charge;
		this.tCode = tCode;
	}

	// method
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

	// toString
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
} // class MovieVo end

class MvReserve implements Ipo {

	List<MovieVo> movieList = new ArrayList<>();

	@Override
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("예매번호 이름 영화코드 관람인원 기본요금 시간대코드");

		int i = 0;
		while (true) {
			String line = in.nextLine();
			if (line.equals("q")) {
				System.out.println();
				break;
			} // if end
			String[] li = line.trim().split(",");
			String num = li[0].trim();
			String name = li[1].trim();
			String mvCode = li[2].trim();
			int person = Integer.parseInt(li[3].trim());
			double charge = Double.parseDouble(li[4].trim());
			char tCode = li[5].toUpperCase().charAt(0);
			MovieVo movieVo = new MovieVo(num, name, mvCode, person, charge, tCode);
			movieList.add(movieVo);
			i++;
		} // while end
	}// input() end

	@Override
	public void process() {
		for (int i = 0; i < movieList.size(); i++) {
			MovieVo vo	=	movieList.get(i);
			vo.setKum(vo.getCharge()*vo.getPerson()); // 총금액(kum) 계산
			
			switch (vo.gettCode()) {
			case 'M': vo.settName("조조"); vo.setFee(0.0); break;
			case 'D': vo.settName("일반"); vo.setFee(0.05); break;
			case 'N': vo.settName("심야"); vo.setFee(0.10); break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + vo.gettCode());
			} // switch문 시간대명, 할증액 end
			double		fee		=	vo.getKum() * vo.getFee();
			vo.setTotKum(vo.getKum()+ fee );
						
			switch (vo.getMvCode()) {
			case "A1": vo.setMvName("액션대작"); break; 
			case "R1": vo.setMvName("로멘스극장"); break;
			case "C1": vo.setMvName("코미디쇼"); break;
			case "H1": vo.setMvName("공포특집"); break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + vo.getMvCode());
			} // switch문 영화명 end
			Collections.sort(movieList, (vo1, vo2) -> Double.compare(vo2.getTotKum(), vo1.getTotKum()));
		} // for end
	} // process() end

	@Override
	public void output() {
		String title = "예매번호 이름 영화명 총요금 할증액 최종결제금액 시간대명";
		System.out.println(title);

		for (MovieVo movieVo : movieList) {
			String fmt = "%s %s %s %.2f %.2f %.2f %s\n";
			System.out.printf(fmt, movieVo.getNum(), movieVo.getName(), movieVo.getMvName(), movieVo.getKum(),
					movieVo.getFee(), movieVo.getTotKum(), movieVo.gettName());
		} // for end
	} // output() end

} // class MvReserve end

public class MovieReserve {

	public static void main(String[] args) {

		MvReserve mvReserve = new MvReserve();
		mvReserve.input();
		mvReserve.process();
		mvReserve.output();

	} // main end

} // class MovieReserve end
