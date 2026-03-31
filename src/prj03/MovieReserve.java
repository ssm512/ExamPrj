package prj03;
// 입력data : 예매번호,이름,영화코드,관람인원,기본요금,시간대코드
// 출력     : 예매번호,이름,영화명,총요금,할증액,최종결제금액,시간대명

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


public class MovieReserve {

	public static void main(String[] args) {
		

	} // main end

} // class MovieReserve end
