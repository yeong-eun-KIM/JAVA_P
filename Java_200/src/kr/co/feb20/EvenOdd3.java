package kr.co.feb20;
//ch45
public class EvenOdd3 {
	public static void showOddEvenf(int n) {
		int temp = n;
		for(; temp != 1;) {
			if(temp % 2 == 1) {
				temp = temp*3+1;
			}
			else {
				temp/=2;
			}
			System.out.println("[" + temp + "]");
		}
	}
	
	public static void main(String[] args) {
		showOddEvenf(122);
	}
}
