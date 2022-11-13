/* 2. This question is asked by Google. Given a string, return whether or not it uses 
capitalization correctly. A string correctly uses capitalization if all letters are capitalized, 
no letters are capitalized, or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true  */

import java.util.Scanner;
public class Q2{
	
	public static boolean checkCapital(String s){
		if(s==s.toUpperCase())
			return true;
		if(s==s.toLowerCase())
			return true;
		else{
			for(int i=0;i<s.length();i++){
				if(i!=0){
					if(Character.isUpperCase(s.charAt(i)))
						return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean x = checkCapital(s);
		if(x==true)
			System.out.println("A string correctly uses capitalization");
		else
			System.out.println("A string doesn't use capitalization correctly");
	}
}