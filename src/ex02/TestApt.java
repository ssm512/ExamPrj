package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Ipo {
	void		input();
	void		process();
	void		output();
} // interface Ipo end

class AptVo {
	// Field
	// 입력
	private	String		dong;
	private	String		name;
	private	int			elUsage;
	private	int			waUsage;
	private	double		charge;
	private	char		sCode;
	//출력
	private	double		elFee;
	private	double		waFee;
	private	double		totCharge;
	private	String		sName;
	//Constructor
	public AptVo(String dong, String name, int elUsage, int waUsage, double charge, char sCode) {
		this.dong = dong;
		this.name = name;
		this.elUsage = elUsage;
		this.waUsage = waUsage;
		this.charge = charge;
		this.sCode = sCode;
	} 
	//method
	// getter & setter
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getElUsage() {
		return elUsage;
	}
	public void setElUsage(int elUsage) {
		this.elUsage = elUsage;
	}
	public int getWaUsage() {
		return waUsage;
	}
	public void setWaUsage(int waUsage) {
		this.waUsage = waUsage;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public char getsCode() {
		return sCode;
	}
	public void setsCode(char sCode) {
		this.sCode = sCode;
	}
	public double getElFee() {
		return elFee;
	}
	public void setElFee(double elFee) {
		this.elFee = elFee;
	}
	public double getWaFee() {
		return waFee;
	}
	public void setWaFee(double waFee) {
		this.waFee = waFee;
	}
	public double getTotCharge() {
		return totCharge;
	}
	public void setTotCharge(double totCharge) {
		this.totCharge = totCharge;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	//toString
	@Override
	public String toString() {
		return "AptVo [dong=" + dong + ", name=" + name + ", elUsage=" + elUsage + ", waUsage=" + waUsage + ", charge="
				+ charge + ", sCode=" + sCode + ", elFee=" + elFee + ", waFee=" + waFee + ", totCharge=" + totCharge
				+ ", sName=" + sName + "]";
	}
} // class AptVo end

class AptUse implements Ipo {
		List<AptVo> aptList	=	new	ArrayList<>();
		
	@Override
	public void input() {
		Scanner		in		=	new	Scanner(System.in);
		System.out.println("동호수 세대주명 전기사용량 수도사용량 기본관리비 평형코드");
		int i = 0;
		while (true) {
			String line = in.nextLine();
			if (line.equals("q")) {
				System.out.println();
				break;
			} // if end
			String	[] li 				= line.trim().split(",");
			String 		dong 			= li[0].trim();
			String 		name 			= li[1].trim();
			int 		elUsage 		= Integer.parseInt(li[2].trim());
			int 		person 			= Integer.parseInt(li[3].trim());
			double 		charge 			= Double.parseDouble(li[4].trim());
			char 		sCode 			= li[5].toUpperCase().charAt(0);
			AptVo 		aptVo 			= new AptVo(name, name, person, person, charge, sCode);
			aptList.add(aptVo);
			i++;
		} //while end
	} // input() end
	
	@Override
	public void process() {
		for (int i = 0; i < aptList.size(); i++) {
			AptVo	vo	=	aptList.get(i);
			vo.setElFee(vo.getElUsage() * 120.0);
			vo.setWaFee(vo.getWaUsage() * 900.0);
			vo.setTotCharge(vo.getCharge() + vo.getElFee() + vo.getWaFee());
			switch ( vo.getsCode()) {
			case 'A': vo.setsName("20평형");break;
			case 'B': vo.setsName("30평형");break;
			case 'C': vo.setsName("40평형");break;
			case 'D': vo.setsName("50평형");break;
			default:
				throw new IllegalArgumentException("Unexpected value: " +  vo.getsCode());
			} // switch end
		} // for end
	} // process() end

	@Override
	public void output() {
		String title = "동호수 세대주명 전기요금 수도요금 총관리비 평형명";
		System.out.println(title);
		for (AptVo aptVo : aptList) {
			String fmt = "%s %s %.2f %.2f %.2f %s\n";
			System.out.printf(fmt, aptVo.getDong(), aptVo.getName(), aptVo.getElFee(), aptVo.getWaFee(), aptVo.getTotCharge(), aptVo.getsName());
		} // for end
	} //output() end
} // class AptUse end

public class TestApt {

	public static void main(String[] args) {
		AptUse	aptuse	=	new	AptUse();
		aptuse.input();
		aptuse.process();
		aptuse.output();

	} // main end

} // class TestApt end
