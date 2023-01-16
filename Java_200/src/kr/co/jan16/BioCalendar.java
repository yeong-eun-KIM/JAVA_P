package kr.co.jan16;
//ch28,29 static 메서드 이용하기
public class BioCalendar {

	public static final int PHYSICAL = 23; //상수정의
	
	public static double getBioRhythm(long days,int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	}	//static 메서드 선언
	
	public static void main(String[] args) {
		int days = 1200;
		double phyval = getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.",phyval);
	}
}
