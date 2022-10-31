package array;

import java.util.Scanner;

public class N2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int n = 0;
		int max = 0;
		int k = 1;
		for(;n<arr.length;n++) {
			arr[n] = scan.nextInt();
			if(max<arr[n]) {
				max = arr[n];
				k = n;
			}
		}
		System.out.println(max);
		System.out.println(k+1);
		scan.close();
	}
}
