//21. How to convert Array to ArrayList in java ?

import java.util.*;

public class Array21{
	public static void main(String[]args){
		int a[] = new int[]{5,10,15,20,25,30};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++){
			list.add(a[i]);
		}
		
		for(Integer x : list)
			System.out.print(x+" ");
	}
}