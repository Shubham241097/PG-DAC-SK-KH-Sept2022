// 21. You need to write a Java method that will accept a String and a character to be removed and return a String, which doesn't has that character e.g remove(String word, char ch).

import java.util.*;
class String21
{
	public static String removeChar(String s , char a)
	{
		String m="";
		String s1="" + a;          // converting char to string bcoz line 12 will not work with a char and a string paramter
		for(int i=0;i<s.length();i++)
		{
			m=s.replace( s1 , "");
		}
		return m;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.nextLine();
		System.out.println("Enter the character to delete :");
		char a=sc.next().charAt(0);		
		System.out.println("The string after deleting the character "+a+" is : ");
		System.out.println(removeChar(s,a));		
	}
}

/*
Enter the string
teamgogetters
Enter the character to delete :
e
The string after deleting the character e is :
tamgogttrs
*/