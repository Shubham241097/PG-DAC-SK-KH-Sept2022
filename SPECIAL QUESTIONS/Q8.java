/* 8. Given a string and the ability to delete at most one character, return whether or not it can 
form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and 
backwards.
Ex: Given the following strings...
"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false  */

import java.util.Scanner;
import java.util.Stack;
public class Q8{
	public static void main(String[]args){
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		StringBuffer s = new StringBuffer (sc.next());
		System.out.println("Enter the position(starting with zero) of character to delete");
		int pos = sc.nextInt();
		if(pos < s.length()-1){
			for(int i=0;i<s.length();i++){
				stack.push(s.charAt(i));
				if(i==pos)
					s.replace(pos,pos+1,"");
			}
		}
		//System.out.println(s);
		boolean flag=false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=stack.pop()){
				flag=true;
				System.out.println("String is not Palindrome");
				break;
			}
		}
		if(flag==false)
			System.out.println("String is Palindrome");
	}
}