import java.util.*;
class Bitwise
{
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b values:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a/b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(a<<1);
		System.out.println(a<<2);
		System.out.println(b>>1);
		System.out.println(b>>2);
	}
}


