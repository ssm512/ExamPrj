package ch05;

public class sec10 {

	public static void main(String[] args) {
		// array copy by for example
		// 길이 3인 배열
		int[]	oldIntArray	=	{1,2,3};
		// 길이 5인 배열을 새로 생성
		int[]	newIntArray	=	new int[5];
		// 배열 항목 복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i]		=	oldIntArray[i];	
		}
		for (int j = 0; j < newIntArray.length; j++) {
			System.out.println(newIntArray[j] + ",");
			
		}

	} // main end

} // class sec10 end
