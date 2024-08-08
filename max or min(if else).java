import java.util.*;
class Mx
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is maximum");
			System.out.println(b+" is minimum");
		}
		else
		{
			System.out.println(a+" is minimum");
			System.out.println(b+" is maximum");
		}		
	}
}
