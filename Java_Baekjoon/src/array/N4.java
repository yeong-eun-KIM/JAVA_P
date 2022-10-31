package array;

import java.util.Arrays;
import java.util.Scanner;

public class N4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();
		int[] arr = new int[sub];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int score = sc.nextInt();
			arr[i] = score;
			sum += score;
			}
		double dsum = (double)sum;
		Arrays.sort(arr);
		int max = arr[arr.length-1];
	
		System.out.println((dsum*100)/(double)(max*sub));
		
		sc.close();
	}
}
