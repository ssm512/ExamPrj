package ex02;
//입력data : 동호수,세대주명,전기사용량,수도사용량,기본관리비,평형코드
//출력     : 동호수,세대주명,전기요금,수도요금,총관리비,평형명



//전기요금 = 전기사용량 * 120
//수도요금 = 수도사용량 * 900
//총관리비 = 기본관리비 + 전기요금 + 수도요금
//평형명   = A:20평형, B:30평형, C:40평형, D:50평형

// 금액은 소수이하 두자리로 반올림
// 모든 기능은 class에 구현한다.
// 선형자료구조인 ArrayList 를 사용하여 전체 데이터를 한번에 처리한다

/*
101-1201,김도윤,250,18,50000,A
102-1502,이하린,310,22,65000,B
103-1803,박서아,420,30,80000,C
*/
interface Ipo {
	void		input();
	void		process();
	void		output();
} // interface Ipo end

class AptVo {
	//입력data : 동호수,세대주명,전기사용량,수도사용량,기본관리비,평형코드
	//			dong	name	elUsage		waUsage		charge		sCode
	private	String		dong;
	private	String		name;
	private	int			elUsage;
	private	int			waUsage;
	private	double		charge;
	private	char		sCode;
	//출력     : 동호수,세대주명,전기요금,수도요금,총관리비,평형명
	//			dong	name	elFee	waFee	totCharge	sName
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
	
	@Override
	public void input() {

		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}} // class AptUse end

public class TestApt {

	public static void main(String[] args) {
		

	} // main end

} // class TestApt end
