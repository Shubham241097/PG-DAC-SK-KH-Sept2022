/*
11. Given two strings, s and t, merge the two strings together alternating characters starting 
with s.
Note: If one string is longer than the other, append the remaining characters of the longer 
string at the end of the merged string.
s = "abc", t = "def", return "adbecf"
*/


import java.util.Scanner;
public class Q11{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		String x = "";
		
		for(int i=0;i<s.length();i++){
			x=x+s.charAt(i);
			x=x+t.charAt(i);
		}
		
		System.out.println(x);
	}
}