
// Print the sum of all even number which given by users . 
import java.util.Scanner;
public class Forloop1 {
	public static void main(String[] args )
	{
		int  i,n,m,sum=0;
		System.out.println(" Please enter the inetial number = ");
		Scanner imp = new Scanner (System.in);
		n=imp.nextInt();
		System.out.println(" Please enter the last  number = ");
		Scanner inpot = new Scanner (System.in);
		m=inpot.nextInt();
		for(i=n;i<=m;i++)
		{
			if(i%2==0)
			{
				System.out.print("   "+i);
				sum= sum+i;
			}
		}
		
		System.out.println(" \n \n  The sum is =  "+sum );
	}

}
