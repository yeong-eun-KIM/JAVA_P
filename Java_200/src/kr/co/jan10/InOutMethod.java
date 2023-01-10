package kr.co.jan10;

import java.util.Scanner;

//ch25. 키보드로 입력받아 콘솔에 출력하기
public class InOutMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int inputD = scan.nextInt();
		System.out.println("입력한 정수 : " + inputD);
		
		System.out.println("실수를 입력하세요.");
		double inputF = scan.nextDouble();
		System.out.println("입력한 실수 : "+ inputF);
		
		System.out.println("문자열을 입력하세요.");
		String inputS = scan.next();
		System.out.println("입력한 문자열 : " + inputS);
		
		scan.close();
	}
}
