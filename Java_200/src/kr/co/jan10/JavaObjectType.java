package kr.co.jan10;

import java.util.Calendar;
import java.util.Date;

//ch16. API에서 제공하는 참조 타입 사용하기
public class JavaObjectType {
	public static void main(String[] args) {
		int[] arr  = {1,2,3};
		int [] arr2 = new int[3];
		
		String str = "String";
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance(); //1970.1.1부터 현재까지 경과 시간을 long 타입으로 표현
		
		System.out.println("arr : " + arr + "arr2 :  "+ arr2);
		System.out.println("str : " + str);
		System.out.println("Date : " +  today + "Cal : " + cal);		
		
	}
}
