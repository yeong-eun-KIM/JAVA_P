package kr.co.jan16;
//ch36. 입력받은 정수값에 따라 신체, 감정, 지능값 출력하기
public class BioSwitch {
	public static String texInfo(int index, double value) {
		String result = "";
		switch(index) {
		case 23 : result = "신체지수"; break;
		case 28 : result = "감정지수"; break;
		case 33 : result = "지능지수"; break;
		}
		return result + value*100;
	}
	
	public static void main(String[] args) {
		int index = 23;
		double value = 0.86;
		String result = texInfo(index, value);
		System.out.println(result);
	}
}
