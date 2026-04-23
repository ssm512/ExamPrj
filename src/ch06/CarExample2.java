package ch06;

public class CarExample2 {

	public static void main(String[] args) {
		// 생성자 호출
		Car2		car1	=	new	Car2();
		System.out.println("car2.company : " + car1.company);
		System.out.println();
		
		Car2		car2		=	new Car2("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car2		car3		=	new Car2("자가용", "빨강");
		System.out.println("car2.company : " + car3.company);
		System.out.println("car2.model : " + car3.model);
		System.out.println("car2.color : " + car3.color);
		System.out.println();
		
		Car2		car4		=	new Car2("자가용", "빨강", 200);
		System.out.println("car2.company : " + car4.company);
		System.out.println("car2.model : " + car4.model);
		System.out.println("car2.color : " + car4.color);
		System.out.println("car2.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	} // main end

} // class CarExample2 end
