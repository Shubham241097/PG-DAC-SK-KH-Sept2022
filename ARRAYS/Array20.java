//20. How do you separate zeros and non-zeros in a given Array in java?

import java.util.*;

public class Array20{
	public static void main(String[]args){
		int a[] = new int []{21,0,0,123,0,3,0,43};
		int b[] = new int [a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				b[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}