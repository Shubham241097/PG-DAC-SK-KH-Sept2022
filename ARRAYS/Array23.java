//23. How to convert ArrayList to String Array in java ?

import java.util.*;

public class Array23{
	public static void main(String[]args){
		/*
		List<String> list = new ArrayList<String>();
		
		
		list.add("Army");
		list.add("Navy");
		list.add("Air Force");
		
		String s[] = list.toArray(new String[list.size()]);
		
		System.out.print(Arrays.toString(s));
		*/
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(70);
		list.add(15);
		list.add(42);
		list.add(99);
		
		String s[] = new String[list.size()];
		
		for(int i=0;i<list.size();i++){
			s[i]=String.valueOf( list.get(i) );
		}
		
		System.out.print(Arrays.toString(s));
		
	}
}