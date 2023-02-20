package kr.co.feb20;
//ch44
public class EvenOdd2 {
	public static void showOddnEven(int n) {
	int temp = n;
	do {
		if(temp%2 == 1) {
			temp = temp*3 + 1;
			
		}
		else {
			temp = temp/2;
		}
		System.out.println("[" + temp + "]");
	} while(temp != 1);
	
	}
	public static void main(String[] args) {
		showOddnEven(122);
	}
}
