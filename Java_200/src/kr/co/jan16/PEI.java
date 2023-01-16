package kr.co.jan16;

public enum PEI {
	PHYSICAL(23),EMOTIONAL(28),INTELLECTUAL(33); //값변경 불가
	private final int peiValue;
	PEI(int pie){
		this.peiValue = pie;
	}	//enum 값을 초기화 하는 생성자
	public int getPei() {
		return peiValue;
	}
}
