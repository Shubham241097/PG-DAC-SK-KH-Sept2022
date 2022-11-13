//3. How to check if two Strings are anagrams of each other?

import java.util.*;
public class String3{
	public static void main(String[]args){
		String s1 = "Note";
		String s2 = "Tone";
		String s3 = "";
		String s4 = "";
		//System.out.println(s1.equalsIgnoreCase(s2));
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++){
			s3 =s3+a[i];
			s4 =s4+b[i];
		}
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.equalsIgnoreCase(s4));
	}
}