package ch03;

public class sec01 {

	public static void main(String[] args) {
		// Sign Operator Example
		int			x		=	-100;
		x					=	-x;
		System.out.println("x : " + x);
		
		byte		b		=	100;
		int			y		=	-b;
		System.out.println("y : " + y);
		
		// Increase Decrease Operator Example
		int			c		=	10;
		int			d		=	10;
		int			e;
		
		c++;
		++c;
		System.out.println("c : " + c);
		
		System.out.println("-------------------------");
		d--;
		--d;
		System.out.println("d : " + d);
		
		System.out.println("-------------------------");
		e 					=	c++;
		System.out.println("e : " + e);
		System.out.println("c : " + c);
		
		System.out.println("-------------------------");
		e					=	++c + d++;
		System.out.println("e : " + e);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	} // main end

} // class sec01 end
