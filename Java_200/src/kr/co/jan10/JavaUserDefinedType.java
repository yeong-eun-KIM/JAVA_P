package kr.co.jan10;

//ch17. 사용자 정의 참조 타입 사용하기
//사용자 정의 클래스 생성
class JLoacation{
	public double lat;
	public double lng;
}

public class JavaUserDefinedType {
	public static void main(String[] args) {
		double latitude = 37.5;
		double longitude = 127.0;
		
		//사용자 정의 객체 생성
		JLoacation jl = new JLoacation();
		jl.lat = latitude;
		jl.lng = longitude;
		
		System.out.println("latitude : "+ jl.lat + " longitude : " + jl.lng);
			
	}
}
