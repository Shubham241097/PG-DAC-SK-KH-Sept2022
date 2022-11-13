// 3. Java Program to illustrate use of Instance Inner class.
class Outer{
	private int num = 20;
	
	public class Inner{
		private int num = 40;
		
		public void print(){
			int num = 60;
			System.out.println("Num : "+Outer.this.num);    //20			
			System.out.println("Num : "+this.num);   //40
			System.out.println("Num : "+num);		//60
		}
		
	}
	
}
public class Q3{
	public static void main(String[]args){
		Outer.Inner in = new Outer().new Inner();
		in.print();
	}
}