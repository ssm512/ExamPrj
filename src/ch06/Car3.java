package ch06;

public class Car3 {
	//Field
	String		company	=	"현대자동차";
	String		model;
	String		color;
	int			maxSpeed;
	
	Car3(String model) {
		//20라인 생성자 호출
		this(model, "은색", 250);
	}
	
	Car3(String model, String color) {
		//20라인 생성자 호출
		this(model, color, 250);
	}
	
	Car3(String model, String color, int maxSpeed) {
		this.model		=	model;
		this.color		=	color;
		this.maxSpeed	=	maxSpeed;
	}
	} // class Car3 end
