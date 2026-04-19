package ch05;

public class sec04 {

	public static void main(String[] args) {
		// array create by value list example
		// 배열 변수 선언과 배열 생성
		String	[]	season	=	{"Srping", "Summer", "Fall", "Winter"};
		
		// 배열의 항목값 읽기
		System.out.println("seaseon[0] : " + season[0]);
		System.out.println("seaseon[1] : " + season[1]);
		System.out.println("seaseon[2] : " + season[2]);
		System.out.println("seaseon[3] : " + season[3]);
		
		// 인덱스 1번 항목의 값 변경
		season[1]				=	"여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
		// 배열 변수 선언과 배열 생성
		int	[]	scores		=	{ 83, 90, 87 };
		
		// 총합과 평균 구하기
		int		sum			=	0;
		for (int i = 0; i<3; i++) {
			sum		+= scores[i];
		}
		System.out.println("총합 : " + sum);
		double		avg		=	(double) sum/3;
		System.out.println("평균 : " + avg);
	} // main end

}// class sec04 end
