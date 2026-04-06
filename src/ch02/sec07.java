package ch02;

public class sec07 {

	public static void main(String[] args) {
		// Casting Example
		int				var1		=	10;
		byte			var2		=	(byte) var1;
		System.out.println(var2);	//	강제 타입 변환후 에 10이 그대로 유지
		
		long 			var3		=	300;
		int				var4		=	(int) var3;
		System.out.println(var4);	// 강제 타입 변환 후에 300이 그대로 유지
		
		int				var5		=	65;
		char			var6		=	(char) var5;
		System.out.println(var6); 	// 'A' 출력
		
		double			var7		=	3.14;
		int				var8		=	(int) var7;
		System.out.println(var8); 	// 3 이 출력

	} // main end

} // class sec07 end
