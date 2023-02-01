package Main;

public class Typecasting {
	public static void main(String[] args) {
		int a,b,c;
		float avg , avg2;
		a=12;
		b=23;
		c=11;
		avg=(a+b+c)/3;
		char x,y;
		x= '9'; // character a 12,22, amn likha jane na 1 ta sonka likha jabe
		y= '@';
	
		
		avg2= (float) (a+b+c)/3;
		System.out.println(" The average number is = "+ avg);
		System.out.println(" The second average number is = "+ avg2);
		
		System.out.println(" The character is = " + x);
		
		
	}

}
