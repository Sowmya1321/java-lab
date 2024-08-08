import java.util.*;
class Assignment
{
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b values:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a value is: "+(a+=b));
		System.out.println("a value is: "+(a-=b));
		System.out.println("b value is: "+(b*=a));
		System.out.println("b value is: "+(b/=a));
		System.out.println("a value is: "+(a%=b));
	}
}
	
		
		


