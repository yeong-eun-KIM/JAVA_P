package kr.co.jan16;
//ch30 멤버메서드 이용하기
public class BioCalendar2 {

	public static final int PHYSICAL = 23;
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	} //멤버 메서드 사용
	
	public static void main(String[] args) {
		int days = 1200;
		BioCalendar2 bio = new BioCalendar2();	//멤버메서드이므로 객체 생성 필요
		
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		
		System.out.printf("나의 신체 지수 %1$.2f입니다.",phyval);

	}
}
