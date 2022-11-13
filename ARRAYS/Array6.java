//6. Print the third-largest number in an array without sorting it 
//Input: [ 24,54,31,16,82,45,67]

import java.util.*;

public class Array6{
	public static void main(String[]args){
		int arr1[] = new int[]{24,54,31,16,82,45,67};
		//int temp[] = new int[arr1.length];
		int largest=0;
		int slargest=0;
		int tlargest=0;
		
		for(int i=0;i<arr1.length;i++){
			/*
			if(a<arr1[i]){
				//count++;
				a=arr1[i];
				b=a;
			}	
			if(a<arr1[i] && arr1[i]<b){
				
			}
			*/
			
			if(arr1[i]>tlargest)
			{
				if(arr1[i]>slargest)
				{
					if(arr1[i]>largest)
					{
						tlargest=slargest;
						slargest=largest;
						largest=arr1[i];
					}
					else
					{
						tlargest=slargest;
						slargest=arr1[i];
					}
				}
				else
					tlargest=arr1[i];
				
				
			}
			
		}//end of for loop
		
		System.out.println("Largest : "+largest);
		//System.out.println("Second Largest : "+slargest);
		//System.out.println("Third Largest : "+tlargest);
		
	}
}