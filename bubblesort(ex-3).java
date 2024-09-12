 import java.util.*;
class Bub
{
	static void bubblesort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
		    for(int j=0;j<n-1;j++)
		    {
		       if(arr[j]>arr[j+1])
		       {
		       	int temp=arr[j];
		       	arr[j]=arr[j+1];
		       	arr[j+1]=temp;
		       	}
		    }
		}
	}
	public static void main(String args[])
	{
		int arr[]={90,45,2,4,13,21};
		System.out.println("unsorted array:");
		{
			for(int i = 0;i<arr.length;i++)
			{
				System.out.println(arr[i]+" ");
			}
			bubblesort(arr);
			System.out.println("sorted array");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}							       	
