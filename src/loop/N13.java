package loop;

import java.util.Scanner;

public class N13 {//더하기 사이클
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// 11(n1) => 1+1 =2 > 12(n2)
		// n1 : 주어진 값, n2 :합성된 값
		// n2 = n1/10 + (n1/10+n%10)%10
		int x = 1;	//사이클 수
		for(int i = 0;i!=n;) {
			if(i>10) {
				i = n;
				i = i/10 +(i%10);
			}
			else {
				i = n*11;
				}
			x++;
		}
		System.out.println(x);
		scan.close();
	}
	
}
