package kr.co.jan10;

//ch19. 주석 달기
public class JavaComment {
	public static void main(String[] args) {
		/*
		 Math.random() : 0.0~1.0 사이의 임의의 실수 반환
		 0.0<=실수값<10.0을 int하면 정수만 반환 => 0~9만 반환
		 */
		int random = (int)(Math.random()*10);
		
		System.out.println("0~9사이의 임의의 정수 출력 : " + random);
	}
}
