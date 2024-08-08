import java.util.*;
class Logical
{
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b,c values:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println((a<b)&&(b>c));
		System.out.println((a>=c)||(c!=b));
		System.out.println((a==c)||(!(c<=b)));
	}
}
