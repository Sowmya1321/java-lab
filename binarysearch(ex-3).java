 import java.util.*;
class Binary 
{
	int binarysearch(int array[], int x, int right, int left) 
	{
		while ( left <= right ) {
		int mid = left + (right - left)/2;
		if(array[mid] == x)
		return mid;
		if(array[mid] < x)
		left = mid + 1;
		else
		right = mid - 1;
	}
	return -1;
}
public static void main(String args[])
{
	binarysearch obj = new binarysearch();
	int array[] = { 2,4,6,8};
	int n = array.length;
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int result = obj.binarysearch(array,x,0,n-1);
	if(result ==-1)
		System.out.println("not found");
	else
		System.out.println("element found at index "+ result);
	}
}
