//20. Write a program to remove a given character from String?
//You need to write a Java method that will accept a String and a character to be removed 
//and return a String, which doesn't has that character e.g remove(String word, char ch).

import java.util.*;
public class String20{
	
	public static void remove(String word,char ch){
		
		char a[] =word.toCharArray();
		String s ="";
		
		for(int i=0;i<a.length;i++){
			if(a[i] != ch ){
				s = s +a[i];
			}
		}
		
		System.out.println(s);
		
	}
	
	
	public static void main(String[]args){
		
		String20.remove("asdefghjkl",'e');
	}
}