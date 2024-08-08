import java.util.*;
class Relational
{
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b values: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("is a greater than b: "+(a>b));
		System.out.println("is a lesser than b: "+(a<b));
		System.out.println("is a greater than or equal to b: "+(a>=b));
		System.out.println("is a lesser than or equal to b: "+(a<=b));
		System.out.println("is a equal to b: "+(a==b));
		System.out.println("is a not equal to b: "+(a!=b));
	}
}
