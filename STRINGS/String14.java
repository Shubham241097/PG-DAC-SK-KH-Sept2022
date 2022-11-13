//14. How to reverse words in a sentence without using a library method?

import java.util.*;

public class String14{
	public static void main(String[]args){
		String s = "I love my country";
		char a[] = s.toCharArray();
		
		String s1="";
		for(int i=(a.length-1);i>=0;i--){
			s1 = s1 + a[i];
		}
		
		System.out.println(s);
		System.out.println(s1);
	}
}