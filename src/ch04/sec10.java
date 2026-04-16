package ch04;

import java.util.Scanner;

public class sec10 {
	public static void main(String[] args) {
		// do while example
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner		in		= new	Scanner(System.in);
		
		String		inputString;
		
		do {
			System.out.println(">");
			inputString		=	in.nextLine();
			System.out.println(inputString);
		} while ( ! inputString.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	} // main end
} // class sec10 end
