import java.util.*;
public class Mol
{
	void mul(int a, int b)
	{
		System.out.println("multiplication is "+(a*b));
	}
	void mul(int a,int b,int c)
	{
		System.out.println("multiplication is "+(a*b*c));
	}
	public static void main(String args[])
	{
		Mol obj = new Mol();
		obj.mul(4,5);
		obj.mul(4,5,6);
	}
}				
