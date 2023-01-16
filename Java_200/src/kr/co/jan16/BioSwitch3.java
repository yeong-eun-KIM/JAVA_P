package kr.co.jan16;
//ch38.enum 값에 따라 신체, 감정, 지능값 출력하기
public class BioSwitch3 {

	public static String textInfor(PEI index, double value) {
		String result = "";
		switch(index) {
		case PHYSICAL : result = "신체지수";break;
		case EMOTIONAL : result = "감정지수";break;
		case INTELLECTUAL : result = "지능지수";break;
		default: result = "미결정";break;
		}
		return result + value*100;
	}
	
	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("신체지수"+index.getPei());
		String st = textInfor(index, value);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index.getPei());
	}
}
