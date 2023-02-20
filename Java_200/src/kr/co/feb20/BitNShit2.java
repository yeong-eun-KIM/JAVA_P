package kr.co.feb20;
//ch 51,52
public class BitNShit2 {
	public static int BITMASK = 1;
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i = 0; i <= 31; i++) {
			s=(a & BITMASK)+s;
			a>>=1; // a/=2와 동일
		
		}
		return s.substring(s.indexOf('1'));
	}
	
	public static void main(String[] args) {
		int num1 = 123;
		System.out.println(shifts(num1));
	}
}
