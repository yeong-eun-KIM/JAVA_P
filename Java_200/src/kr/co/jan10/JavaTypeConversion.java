package kr.co.jan10;

//ch.18 문자열을 실수로 변환하기
public class JavaTypeConversion {
	public static void main(String[] args) {
		String str = "37.5";
		
		double temper = Double.parseDouble(str);
		
		System.out.println(temper);
		
		
	}
}
