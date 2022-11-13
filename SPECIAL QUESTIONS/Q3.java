/* 3. This question is asked by Amazon. Given a string representing the sequence of moves a 
robot vacuum makes, return whether or not it will return to its original position. The 
string will only contain L, R, U, and D characters, representing left, right, up, and down 
respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/

import java.util.Scanner;
public class Q3{
	
	public static int position(String str){
		String s = str.toLowerCase();
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='l' ||s.charAt(i)=='r' ||s.charAt(i)=='d' ||s.charAt(i)=='u'){
				if(s.charAt(i)=='l')
					sum = sum-1;
				else if(s.charAt(i)=='r')
					sum=sum+1;
				else if(s.charAt(i)=='d')
					sum=sum-2;
				else 
					sum=sum+2;
			}
			else
				break;
		}
		return sum;
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int x = position(str);
		if(x==0)
			System.out.println("Returned to original position");
		else
			System.out.println("Not in original position");
	}
}