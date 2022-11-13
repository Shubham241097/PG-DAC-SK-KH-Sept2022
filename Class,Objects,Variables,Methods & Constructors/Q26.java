//26. Java Program to Calculate Sum of Two Byte Values using Type Casting

public class Q26{
	public static void main(String[]args){
		byte a = 10;
		byte b = 20;
		
		//byte c = a+b;  //Not OK  
		//On addition of a and b of datatype byte are implicitly does upcasting(Widening)
		//ie byte is converted to int 
		//but now we have a varible c of type byte which is narrowing so we need to explicitly type cast to byte.
		
		
		byte c = ( (byte)(a+b) );
		System.out.println(c);
	}
}