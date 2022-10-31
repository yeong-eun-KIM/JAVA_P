package loop;

import java.util.Scanner;

public class N4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int sum=0;
		for (;y>0;y--) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum += (a*b);
		}
		if(sum==x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		scan.close();
	}
}
