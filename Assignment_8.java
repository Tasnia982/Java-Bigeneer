// Logical and assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fluent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent English skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview

import java.util.Scanner;
public class Assignment_8 {
	public static void main(String[] args) {
		char ans1,ans2 ;
		System.out.println(" Have you completed your masters? y/n ");
		System.out.println(" Are you fluent in English? y/n ");
		Scanner imp=new Scanner (System.in);
		ans1=imp.next().charAt(0);
		ans2=imp.next().charAt(0);
		if(ans1=='y'  && ans2=='y' )
		{
			System.out.println("  You are eligible to for the job interview !! ");
		}
		else if( ans1=='Y' &&  ans2=='Y')
		{
			System.out.println("  You are eligible to for the job interview !! ");
		}
		
		else
		{
			System.out.println(" Sorry. You are not eligible to for the job interview . ");
		}
		
		
	}
	

}
