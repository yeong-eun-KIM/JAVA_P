package loop;

import java.util.Scanner;

public class N11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		for(;;) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(a!=0 && b!=0) {
			System.out.println(a+b);
			}
			else break;
		}
		scan.close();
	}
}
