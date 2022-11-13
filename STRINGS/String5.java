//5. How to check if a String contains only digits?


import java.util.*;
public class String5{
	public static void main(String[]args){
		String s = "4231242";
		
		try{
			long a = Long.valueOf(s);
			System.out.println(a/1);
		}
		catch(NumberFormatException e){
			System.out.println("String must have only digits");
		}
	}
}