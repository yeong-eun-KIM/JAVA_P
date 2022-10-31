package loop; //별찍기2

import java.util.Scanner;

public class N9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			int y = n-i;
			System.out.println(" ".repeat(y)+"*".repeat(i));
		}
		scan.close();
	}
}
