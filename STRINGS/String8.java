//8. How to count the occurrence of a given character in String?

import java.util.*;
public class String8{
	public static void main(String[]args){
		String s1 = "Programming";
		
		char a[] = s1.toCharArray();
		System.out.println(Arrays.toString(a));
		
		int count=1;
		
		for(int i=0;i<a.length;i++){
			for(int j=(i+1);j<a.length;j++){
				
				if(a[i]==a[j])
					count++;
			}
			System.out.println(a[i]+" : "+count);
			count=1;
		}
		
	}
}