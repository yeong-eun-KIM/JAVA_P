package loop;

import java.util.Scanner;

public class N13NEW {//더하기 사이클
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int t = n;
	    int x = 0;

	    do{
	        n = (n%10)*10 + (n/10+n%10)%10;
	        x++;
	    } while(
	    	n != t
	    );

	    System.out.println(x);
	    scan.close();
	}
	
}
