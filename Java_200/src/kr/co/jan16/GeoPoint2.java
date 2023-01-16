package kr.co.jan16;
//ch33.객체를 이용하여 위도, 경도 표현하기
public class GeoPoint2 {
	public static void main(String[] args) {
		double latitude1 = 37.5;
		double longitude1 = 127.0;
		double latitude2 = 35.13;
		double longitude2 = 129.04;
		
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;

	}
}
