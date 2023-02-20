package kr.co.feb20;
//ch41
public class isLeapYear {
	public static boolean isLeapYear(int year) {
		boolean isS = false;
		if((year%4 == 0) && (year%100!=0)) {
			isS = true;
		}
		return isS;
	}
	
	public static void main(String[] args) {
		int year = 2023;
		boolean leap = isLeapYear(year);
		System.out.println(leap);
	}
}
