package ch03;

public class sec04 {

	public static void main(String[] args) {
		// Conditional Operation example
		int	score	=	92;
		char	grade	=	(score > 90) ? 'A' : ((score>80) ? 'B' : 'C') ;
		System.out.println(score + "점은" + grade + "등급입니다.");

	} // main end

} // class sec04 end
