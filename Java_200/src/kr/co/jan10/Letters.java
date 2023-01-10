package kr.co.jan10;

//ch23. 문자와 문자열의 관계 살펴보기
public class Letters {

	public static void main(String[] args) {
		char ch = '닳';
		String str = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
		System.out.println("'닳'을 포함하고 있을까? : " + str.contains(str));
		System.out.println("'닳'의 위치는 : " + str.indexOf(ch));
		System.out.printf("%c는 %s의 %d번째에 위치한다.",ch,str,str.indexOf(ch));
	}

}
