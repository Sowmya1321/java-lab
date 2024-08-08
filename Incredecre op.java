import java.util.*;
class Incredecre
{
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b values:");
		a=sc.nextInt();
		b=sc.nextInt();
		a++;
		--b;
		b++;
		a=a+b;
		System.out.println("a equal to: "+a);
		System.out.println("b value is: "+b);
	}
}
