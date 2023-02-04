
// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover

import java.util.Scanner;
public class Assignment7 {
	public static void main(String[] args) {
		char ans = 0;
		System.out.println("Do you love java? \n \n If yes press Y/y and if no press N/n ");
		Scanner  imp =new Scanner (System.in);
		ans=imp.next().charAt(ans);
		if( ans == 'Y' || ans =='y')
		{
			System.out.println("you are a java lover ");
		}
		else if (ans == 'N' || ans == 'n')
		{
			System.out.println("you are not a java lover ");
		}
		
		else
		{
			System.out.println(" Wrong input!!! Please enter the right option");
		}
		
	}

	

}
