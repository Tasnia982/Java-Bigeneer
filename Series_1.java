
import java.util.Scanner;

public class Series_1 {
	public static void main (String[] args ) {
		int sum=0,n,i;
		System.out.print(" Enter the series last number = ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print(i+"*"+i + " + " );
			sum=sum+i*i;
			
		}
		System.out.println(" \n \n The sum =  "+sum);
		
	}

}
