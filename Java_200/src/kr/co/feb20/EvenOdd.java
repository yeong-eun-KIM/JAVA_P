package kr.co.feb20;
//ch43
public class EvenOdd {
	public static void showOddEvenw(int n) {
		int temp = n;
		while(temp != 1) {
			if(temp %2 ==1) {
				temp = temp*3+1;
			}
			else {
				temp = temp/2;
			}
			System.out.print("["+temp+"]");
		}
	}
	
	public static void main(String[] args) {
		showOddEvenw(122);
	}
	
}
