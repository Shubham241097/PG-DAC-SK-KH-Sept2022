//9. How to convert numeric String to an int?
//For example, if you pass "67263" to the program then it should return 67263.


import java.util.*;
public class String9{
	public static void main(String[]args){
		String s = "67263";
		
		int a = Integer.valueOf(s);
		System.out.println(a);
	}
}   