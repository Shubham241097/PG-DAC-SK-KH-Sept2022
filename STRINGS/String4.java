//4. How to program to print the first non repeated character from String?

import java.util.*;
public class String4{
	public static void main(String[]args){
		
		String s ="Java";
		char a[] = s.toCharArray();
		int count=1;
		
		
		for(int i=0;i<a.length;i++){
			
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count==1){
				System.out.println(a[i]);
				break;
			}
			count=1;
		}
		
		
	}
}