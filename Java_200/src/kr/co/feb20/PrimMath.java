package kr.co.feb20;
//ch49
public class PrimMath {
	public static boolean isPrime(int n) {
		boolean isS = true;
		for(int i = 2; i < (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
	
	public static void main(String[] args) {
		int number = 1234567;
		boolean isPrime = isPrime(number);
		System.out.println(isPrime);
	}
}
