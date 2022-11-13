//15. How to remove duplicate characters from String?
//For example, if the input is ‘bananas’ the output will be ‘bans’.


import java.util.*;

public class String15{
	public static void main(String[]args){
		String s = "bananas";
		char a[] = s.toCharArray();
		String s1 = "";
		int i;
		int j;
		
		for(i=0;i<a.length;i++){
			for(j=0;j<a.length;j++){
				
				if(a[i]==a[j]){
					break;
				}
			}
			if(i==j){
				s1 =s1+a[i];
			}
		}
		System.out.println(s);
		System.out.println(s1);  //bans
		
		
		
		/*
		int count=1;
		
		for(int i=0;i<a.length;i++){
			for(int j=(i+1);j<a.length;j++){
				
				if(a[i]==a[j]){
					count++;
					break;
				}
			}
			if(count==1){
				s1 =s1+a[i];
			}
			count=1;
		}
		System.out.println(s);
		System.out.println(s1);  //bnas
		
		*/
	}
}