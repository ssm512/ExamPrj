package ch04;

import java.util.Iterator;

public class sec07 {

	public static void main(String[] args) {
		// print from 1 to 10 example
		for(int i=1; i<=10; i++) {
			System.out.println(i + " ");
		} // for end
		// print sum from 1 to 100 example
		int		sum	=	0;
		int		j;
		for ( j = 1; j <= 100; j++) {
			sum += j;
		}
		System.out.println("1~" + (j-1) + " 합 : " + sum);
		// float counter example
		for(float x=0.1f; x<=1.0f;x+=0.1f) {
			System.out.println(x);
		}// for end
		// 구구단을 이중 for문으로
		for (int a=1; a<=9;a++) {
			System.out.println("***" + a + "단 ***");
			for (int b=1; b<=9;b++) {
				System.out.println(a + "x" + b + "=" + (a*b));
			}
		}
	} // main end

} // class sec07 end
