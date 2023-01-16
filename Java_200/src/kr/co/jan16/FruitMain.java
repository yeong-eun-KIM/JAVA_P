package kr.co.jan16;
//ch31 상수의 묶음 클래스 enum 사용하기
public class FruitMain {
	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println("APPLE의 순서 : " + pear.ordinal());
		System.out.println("MANGO의 순서 : " + pear2.ordinal());
		FRUIT[] fruits = FRUIT.values();
		System.out.println(fruits[0]);
	}
}
