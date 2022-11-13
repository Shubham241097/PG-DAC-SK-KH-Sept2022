//7. You need to write a program to print all duplicate character and their count in Java. For 
//example, if given String is "Programming" then your program should print
//  g : 2
//  r : 2
//  m : 2

import java.util.*;
public class String7{
	public static void main(String[]args){
		String s1 = "Programming";
		
		char a[] = s1.toCharArray();
		System.out.println(Arrays.toString(a));
		
		int count=1;
		
		for(int i=0;i<a.length;i++){
			for(int j=(i+1);j<a.length;j++){
				
				if(a[i]==a[j]){
					count++;
					System.out.println(a[j]+" : "+count);
				}
			}
			count=1;
		}
		
	}
}