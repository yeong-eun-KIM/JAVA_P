package loop;

import java.util.Scanner;	//X보다 작은수

public class N10{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();	//추출수
	int x = scan.nextInt(); //기준
	for(int i=1;i<=n;i++) {
		int y = scan.nextInt();
		if(y<x) {
			System.out.print(y + " ");
		}
		else {
			continue;
		}
	}
	scan.close();
	}
}
