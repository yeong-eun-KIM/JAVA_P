package array;

import java.util.Arrays;
import java.util.Scanner;

public class N1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		for(int n = 0; n<arr.length; n++) {
			arr[n] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[arr.length-1]);

		scan.close();
	}
}
