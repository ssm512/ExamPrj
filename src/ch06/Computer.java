package ch06;

public class Computer {
	// 가변길이 매개변수를 갖는 메소드 선언
	int		sum(int ... value) {
		//sum 변수 선언
		int sum		=0;
		
		//values는 배열 타입의 변수처럼 사용
		for (int i = 0; i < value.length; i++) {
			sum		+= value[i];
			
		}
		return sum;
	}
}
