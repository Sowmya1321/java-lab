import java.util.*;
class Quadratic
{
	public static void main(String args[])
	{
		double a,b,c,d,r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the quotient of a,b,c: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=(b*b)-(4*a*c);
		if(d==0)
		{
		System.out.println("it has only one real root");
		r1=-b/(2*a);
		System.out.println("root of the equation is"+r1);
		}
		else if(d>0)
		{
		System.out.println("it has two real roots");
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("roots of the equation is"+r1+"and"+r2);
		}
		else
		{
		System.out.println("it has no real roots");
		}
	}
}		
		
			
