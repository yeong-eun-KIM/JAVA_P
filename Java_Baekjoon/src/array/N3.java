package array;

import java.util.Scanner;

public class N3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int n = 0;
		int count = 0; // 다른 나머지를 셀 변수
		int k = 0;
		for(;n<arr.length;n++) {
			arr[n] = (scan.nextInt())%42;
			// 나올 수 있는 나머지 0~41
			
			// n1, n2, n3 .... n10
			// 서로 같은지 어떻게 확인해야하나?
			k = arr[n]; //  
			if(k==arr[n-1]) {
				count++; //count 도출 방법 1)서로 다른게 몇개 있는지 구함
			}							//2) 서로 같은게 몇개 있는지 구해서
										// 10에서 빼기 => 다른 갯수
		}
		
		System.out.println(//count);
		scan.close();
	}
}
