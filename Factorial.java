
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.print(" Enter  the number for factorial =  " );
		int  i,a,factor=1;
		Scanner imp = new Scanner (System.in);
		a=imp.nextInt();
		for(i=a;i>=1;i--) {
			
			
			factor=factor*i;
			
		}
		
	System.out.println(" The factorial is  of  " + a + "  =   " +factor  );	
		
		
	}

}
