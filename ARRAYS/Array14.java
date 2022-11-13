//14. Write a program to check whether two given Arrays are equal, given both contains same 
//data type and same length ?

import java.util.*;

public class Array14{
	public static void main(String[]args){
		int a[]= new int[]{5,10,15,20,25,30};
		//int b[]= new int[]{155,12,45,23,27,30};
		int b[]= new int[]{5,10,15,20,25,30};
		//String b[] = new String[]{"5","10","15","20","25","30"};
		int count=0;
		
		
		if(a.length == b.length){
			
			for(int i=0;i<a.length;i++){
				if(a[i] != b[i])
					break;
				if(a[i] == b[i]){
					count++;
				}
			}
			if(count == a.length)
				System.out.println("Array a and Array b are Equal");
			else
				System.out.println("Array a And Array b are not Equal");
		}
		
	}
}