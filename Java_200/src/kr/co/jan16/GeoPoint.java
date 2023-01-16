package kr.co.jan16;
//ch32.1,2차원 배열로 위도, 경도 표현하기
public class GeoPoint {
	public static void main(String[] args) {
		double latitude1 = 37.5;
		double longitude1 = 127.0;
		double latitude2 = 35.13;
		double longitude2 = 129.04;
		
		double[] seoul = {latitude1,longitude1};
		double[] busan = {latitude2,longitude2};
		
		double[][] korea = {seoul,busan};
		System.out.println("서울의 위도 : "+korea[0][0] + " 부산의 위도 : "+korea[1][0]);
				
				
	}
}
