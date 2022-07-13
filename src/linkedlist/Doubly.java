package linkedlist;

class Node{
	int value;
	Node prev;
	Node nxt;
	
	public Node(int x){
		this.value=x;
	}


Node head=null;
Node tail=null;

public void addNewNode(int data) {
	Node newnode=new Node(data);
	if(head==null) {
		head=newnode;
		tail=newnode;
		head.prev=null;
		head.nxt=null;
	}
	else {
		tail.nxt=newnode;
		newnode.prev=tail;
		tail=newnode;
		tail.nxt=null;
		
	}
}

public void show() {
	Node curr=head;
	if(head==null) {
		System.out.println("It is empty");
	}
	else {
		System.out.println("Elements are:");
		while(curr!=null) {
			System.out.println(curr.value);
			curr=curr.nxt;
		}
	}
}}

public class Doubly {
  public static void main(String args[]) {
	  Node obj=new Node(6);
	  obj.addNewNode(89);
	  obj.addNewNode(64);
	  obj.addNewNode(101);
	  obj.addNewNode(123);
	  obj.show();
  }
}
