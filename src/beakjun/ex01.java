package beakjun;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner in		=	new	Scanner(System.in);
        int		A		=	in.nextInt();
        int     B       =   in.nextInt();
        double  result;
        result        =    (double)A/B;
        System.out.println(result);

	}

}
/* 백준 답
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    	Scanner in		=	new	Scanner(System.in);
        int		A		=	in.nextInt();
        int     B       =   in.nextInt();
        System.out.println(A+B);
    }
}
*/