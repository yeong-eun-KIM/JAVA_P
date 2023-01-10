package kr.co.jan10;


//ch.26 상수 사용하기
public class BioCalendar {
	public static final int PHYSICAL = 23;
	
	public static void main(String[] args) {
		System.out.println(PHYSICAL);
		
		//ch.27 연산자를 이용하여 바이오리듬 값 구하기
		int index = PHYSICAL;
		int days = 1200;
		double vals = (days%index) * 2 * Math.PI/index;	//math함수 이용
		System.out.println(Math.toDegrees(vals)+"도");	//온도로 변환
	}
}
