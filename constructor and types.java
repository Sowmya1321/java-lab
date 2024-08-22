import java.util.*;
class Student
{
	String name;
	int rollnum;
	Student()
	{
		name = "cse";
		rollnum = 5;
	}
	Student(String str,int n)
	{
		name = str;
		rollnum = n;
	}
	public static void main(String args[])
	{
	 Student s1 = new Student();
	 Student s2 = new Student("ece",9);
	 System.out.println(s1.name);
	 System.out.println(s1.rollnum);
	 System.out.println(s2.name);
	 System.out.println(s2.rollnum);
	 }
}	 
	 
	 		
