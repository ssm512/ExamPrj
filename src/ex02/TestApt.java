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
} // class AptVo end

class AptUse implements Ipo {

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
		
	}} // class AptUse end

public class TestApt {

	public static void main(String[] args) {


	} // main end

} // class TestApt end
