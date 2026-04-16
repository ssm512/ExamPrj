package ch04;

public class sec13 {

	public static void main(String[] args) {
		// continue example
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) { // 2f로 나눈 나머지가 0이 아닐 경우 즉, 홀수인 경우
				continue;
			} // if end
			System.out.println(i + " "); // 홀수에는 실행 안되고, 짝수일때만 실행됨
		} // for end

	} // main end

} // class sec13 end
