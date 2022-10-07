package condition;
import java.util.Scanner;

public class oven{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();
        
        if(m+t>=60) {
        	h = h+((m+t)/60);
        	m = (m+t)%60;
        }
        else {
        	m = m +t;
        	
        }
    	if(h>=24) {
    		h=h-24;
    	}
        System.out.println(h+" "+m);
       scan.close();
    }
}