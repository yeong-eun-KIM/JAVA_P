package loop;

import java.util.Scanner;

public class N12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
			while(scan.hasNextInt()) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a+b);
			}
		scan.close();
	}
}
