package kr.co.jan10;

//ch.22 실수 타입의 변수 사용하기
public class HighHill {
	public static void main(String[] args) {
		double S = 6;
		double P = 0.75;
		double L = 200;
		double T = 0;
		double A = 1;
		double Y = 2;
		double upsl = P*L*(Y+9);
		double downs = (T+1)*(A+1)*(Y+10)*(L+20);
		double ups2 = 12+3*S/8.0;
		double high = upsl/downs*ups2;
		
		System.out.printf("적당한 하이힐의 높이는 %fcm입니다.",high); //전부 출력
		System.out.printf("적당한 하이힐의 높이는 %1$.2fcm입니다.",high); //소수점 두번째까지만 출력
	}
}
