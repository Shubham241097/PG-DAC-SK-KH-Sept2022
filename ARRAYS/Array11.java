//11. How to convert a byte array to String?

import java.util.*;

public class Array11{
	public static void main(String[]args){
		byte a[]= new byte[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		String s[] = new String[a.length];
		
		for(int i=0;i<a.length;i++){
			s[i] = Byte.toString(a[i]);
		}
		
		for(String x : s)
			System.out.print(x+" ");
	}
}