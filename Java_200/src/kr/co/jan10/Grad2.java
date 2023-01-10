package kr.co.jan10;

//ch21. 정수 타입의 배열 사용하기
public class Grad2 {

	public static void main(String[] args) {
		int[] grade = {90, 80, 89};
		int total = grade[0]+grade[1]+grade[2];
		int avg = total/3;
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점\n",grade[0],grade[1],grade[2]);
		System.out.printf("전체 %d점, 평균 %d점",total,avg);
	}
}
