package ch05;

<<<<<<< HEAD
import java.util.Iterator;

public class sec07 {

	public static void main(String[] args) {
		// multi dimensional array by value list example
		//2차원 배열 생성
		int	[]	[]	scores = {
				{ 80, 90, 96 },
				{ 76, 88 }
		}; 
		
		// 배열의 길이
		System.out.println("1차원 배열 길이(반의수) : " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수) : " + scores[1].length);
		
		// 첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("scores[0][2] : " + scores[0][2]);
		// 두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1] : " + scores[1][1]);
		// 첫번째 반의 평균 점수 구하기
		int		class1sum		=	0;
		for (int i = 0; i < scores[0].length; i++) {
			class1sum		+= scores[0][i];
		}
		double		class1avg		=	(double) class1sum/scores[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1avg);
		// 두번째 반의 평균 점수 구하기
		int		class2sum			=	0;
		for (int i = 0; i < scores[1].length; i++) {
			class2sum		+= scores[1][i];
		}
		double	class2avg		=	(double) class2sum/scores[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2avg);
		// 전체 학생의 평균 점수 구하기
		int		totalStudent		=	0;
		int		totalSum			=	0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent		+= scores[i].length;
			for (int j = 0; j < scores[i].length; j++) {
				totalSum		+= scores[i][j];
				
			}
			
		}
		double	totalAvg		=	(double) totalSum/totalStudent;
		System.out.println("전체 학새의 평균 점수 : " + totalAvg);
=======
public class sec07 {

	public static void main(String[] args) {
		// array length example
		//배열 변수 선언과 배열 대입
		int	[]	scores	=	{ 84, 90, 96 };
		 // 배열 항목의 총합 구하기
		int		sum		=	0;
		for (int i = 0; i < scores.length; i++) {
			sum 	+=	scores[i];
		}
		System.out.println("총합 : " +  sum);
		
		// 배열 항목의 평균 구하기
		double		avg		=	(double) sum/scores.length;
		System.out.println("평균 : " + avg);
>>>>>>> a1fc857081939b154b29d2df77a4875e2a701ad9
	} // main end

} // class sec07 end
