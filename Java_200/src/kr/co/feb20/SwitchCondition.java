package kr.co.feb20;
//ch39
public class SwitchCondition {
	public static int toNum(char c) {
		int tot=0;
		switch(c) {
		case 'A': tot=1;break;
		case 'T': tot=10;break;
		case 'J': tot=11;break;
		case 'Q': tot=12;break;
		case 'K': tot=13;break;
		default: tot=c-'0';break;
		}
		return tot;
	}
	public static void main(String[] args) {
		char c ='J';
		int result = toNum(c);
		System.out.println("result = " + result);
	}
}
