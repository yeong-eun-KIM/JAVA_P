package kr.co.feb20;
//ch48
public class Contraction {
	public static int sumEach(int n) {
		int tot = 0;
		while (n != 0) {			
			tot += n % 10;
			n /= 10 ;
		}
		return tot;
		
	}
	
	public static void main(String[] args) {
		int number = 1234567;
		int value = sumEach(number);
		System.out.printf("%d에 대한 각 자리 숫자의 합 : %d", number, value);
	}
}
