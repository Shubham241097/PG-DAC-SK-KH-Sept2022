//12. How to rotate an array left and right by a given number K?

import java.util.*;

public class Array12{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int []{1,2,3,4,5};
		int b[] =Arrays.copyOf(a,a.length);
		
		System.out.println("1. Left Rotate");
		System.out.println("2. Right Rotate");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice){
			
			case 1:
				System.out.println("Enter index from which you want to left rotate an array");
				int k = sc.nextInt();
				int index=0;
				
				for(int i=k;i>=0;i--){
					b[index]=a[i];
					index++;
				}
				for(int i=(a.length-1);i>k;i--){
					b[index] = a[i];
					index++;
				}
				
				
				System.out.println(Arrays.toString(b));
				break;
				
			case 2:
				System.out.println("Enter index from which you want to right rotate an array");
				k = sc.nextInt();
				
				index=0;
				
				for(int i=k;i<a.length;i++){
					b[index]=a[i];
					index++;
				}
				for(int i=0;i<k;i++){
					b[index] = a[i];
					index++;
				}
				
				System.out.println(Arrays.toString(b));
				break;
			default :
				System.out.println("Enter valid Index");
		}
	}
}