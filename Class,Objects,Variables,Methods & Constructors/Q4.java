// 4. Java Program to illustrate use of static Inner class.

class List{
	static class Node{
		private int data;
		private Node next;
		public Node(){
			this.data = 0;
			this.next = null;
		}
		public Node(int val){
			this.data=val;
			this.next=null;
		}
	}
	
	private Node head;
	public List(){
		this.head = null;
	}
	
	
	public void addFirst(int val){
		Node nn = new Node(val);
		nn.next = head;  
		head = nn;  
	}
	
	
	public void displayAll(){
		Node trav = head;
		if(head == null)
			System.out.println("List is Empty");
		else{
			System.out.print("List : ");
			while(trav!=null){
				System.out.print(trav.data + ", ");
				trav = trav.next;
			}
		}
		System.out.println();
	}
	
}
public class Q4{
	public static void main(String[]args){
		List l = new List();
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.displayAll();
	}
}