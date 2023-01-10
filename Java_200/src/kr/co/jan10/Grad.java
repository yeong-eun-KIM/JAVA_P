package kr.co.jan10;

//ch20. 정수연산하기
public class Grad {
	public static void main(String[] args) {
		int kr = 90;
		int en = 80;
		int math = 89;
		int total = kr + en + math;
		int avg = total/3;
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점\n",kr,en,math);
		System.out.printf("전체 %d점, 평균 %d점",total,avg);
	}
}
