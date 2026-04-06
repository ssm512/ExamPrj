package ch02;

public class sec05 {

	public static void main(String[] args) {
		// Text Block Example
		String			str1		=	"" + 
								"{\n" +
								"\t\"id\":\"winter\",\n" +
								"\t\"name\":\"눈송이\"\n" + 
								"}";
		System.out.println(str1);
		String			str2		=	"""
								{
									"id":"winter"
									"name":"눈송이"
								}
								""";
		System.out.println("-------------");
		System.out.println(str2);
		String			str			=	"""
				나는 자바라를 \
				학습합니다.
				나는 자바 교수가 될 겁니다.
				""";
		System.out.println("-------------");
		System.out.println(str);
	} // main end

} // class sec05 end
