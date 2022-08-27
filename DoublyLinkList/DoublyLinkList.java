package org.doublyLink;

public class DoublyLinkList<E> {


	public final class Node
	{
		private E data;
		private Node prev;
	    private	Node next;
		public Node(E val)
		{
			data=val;
			prev=null;
			next=null;
		}
	}
	private Node head,tail,temp2;
	public DoublyLinkList()
	{
		head=null;
		tail=null;
		
		temp2=null;
	}
	
	public void insertAtBegining(E val)
	{
		Node newNode =new Node(val);
		if(head==null)
		{
			head=tail=newNode;return;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void insertAtEnd(E val)
	{
		Node newNode=new Node(val);
		if(head==null) {this.insertAtBegining(val);return;}
		
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		
	}
	public void deleteAtBegining()
	{
		if(head==null||head.next==null)
		{
			head=null;
			System.out.println("Empty");
			return;
		}
		temp2=head;
		head=head.next;
		head.prev=null;
		temp2=null;
	}
	public void deleteAtEnd()
	{
		if(head==null||head.next==null)
		{
			head=null;
			System.out.println("Empty");
			return;
		}
		temp2=tail;
		tail=tail.prev;
		tail.next=null;
		temp2.prev=null;
		temp2=null;
	}
	public void insertAtPos(int pos,E val)
	{
		temp2=head;
		int index=0;
		Node  newNode=new Node(val);
		if(pos==0||head==null)
		{
			this.insertAtBegining(val);return;
		}
		while(index<pos-1)
		{
			temp2=temp2.next;
			index++;
			if(temp2==null)
			{
				System.out.println("Invalid pos");return;
			}
		}
		
		if(temp2==tail)
		{
			this.insertAtEnd(val);return;
		}
		newNode.next=temp2.next;
		newNode.prev=temp2;
		newNode.next.prev=newNode;
		temp2.next=newNode;
	}
	public void deleteAtPos(int pos)
	{
		int index=0;
		temp2=head;
		while(index<pos)
		{
			temp2=temp2.next;
			index++;
			if(temp2==null)
			{
				System.out.println("Invalid position");return;
			}	
		}
		if(temp2==tail)
		{
			this.deleteAtEnd();return;
		}
		temp2.prev.next=temp2.next;
		temp2.next.prev=temp2.prev;
		temp2.prev=null;
		temp2.next=null;
		temp2=null;
	}
	public void display()
	{
		temp2=head;
		System.out.print("[ ");
		while(temp2!=null)
		{
			System.out.print(temp2.data+" ");
			temp2=temp2.next;
		}
		System.out.print("]");
		System.out.println();
	}
}
