package ch04;

public class sec11 {

	public static void main(String[] args) {
		// break example
		while (true) {
			int		num		=	(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
			
			
		} //while end
		System.out.println("프로그램 종료");
		
	} // main end

} // class sec11 end
 