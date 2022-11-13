//22. How to convert Array to TreeSet in java ?


import java.util.*;

public class Array22{
	public static void main(String[]args){
		int a[] = new int[]{5,10,15,20,25,30};
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int x : a){
			set.add(x);
		}
		
		for(Integer x : set)
			System.out.print(x+" ");
	}
}