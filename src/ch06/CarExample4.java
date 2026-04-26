package ch06;

public class CarExample4 {

	public static void main(String[] args) {
		// Car 객체 생성
		Car4 myCar = new Car4();
		
		// 리턴값이 없는 setGas() 메소드 호출
		myCar.setGas(5);
		
		// isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			// 리턴값이 없는 run() 메소드 호출
			myCar.run();
			
		}
		System.out.println("gas를 주입하세요");
	} // main end

} // class CarExample4 end
