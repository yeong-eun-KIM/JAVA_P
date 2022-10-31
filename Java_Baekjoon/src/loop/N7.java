package loop;

import java.util.Scanner;

public class N7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int i=1;i<=x;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a+b;
			System.out.println("Case #"+i+": "+a+" + "+ b +" = "+c);
		}
		scan.close();
	}

}
