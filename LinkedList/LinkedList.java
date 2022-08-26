package org.linkedlist;

public final class LinkedList {

	final class Node
	{
		private  int data;
		private Node next;
		public Node(int val)
		{
			this.data=val;
			next=null;
		}
	}
	private Node head,tail,temp;
	private static Node newNode;
	public LinkedList()
	{
		head=null;
		tail=null;
		temp=null;
	
	}
	public void insertAtBegining(int val)
	{
		newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=head;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}	
	}
	public void insertAtEnd(int val)
	{
		if(tail!=null)
		{
			newNode=new Node(val);
			tail.next=newNode;
			tail=tail.next;
		}
	}
	public void deleteAtBegining()
	{
		if(head==null) {System.out.println("No elements");return;}
		temp=head;
		head=head.next;
		temp=null;
		
	}
	public void deleteAtEnd()
	{
		if(head.next==null||head==null) { head=null;System.out.println("List empty");return;}
		temp=head;
		while(temp.next!=tail)
		{
			temp=temp.next;
		}
		temp.next=null;
		tail=null;
		tail=temp;
	}
	public void insertAtPos(int pos,int val)
	{
		int i=0;
		newNode=new Node(val);
		temp=head;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
			if(temp==null)
			{
				System.out.println("Invalid Position");
				return;
			}
		}
		if(temp.next==null)
		{
			this.insertAtEnd(val);return;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void deleteAtPos(int pos)
	{
		Node te = null;
		temp=head;
		int i=0;
		while(i<pos)
		{
			te=temp;
			temp=temp.next;
			i++;
		}
		if(temp==tail)
			{this.deleteAtEnd();return;}
		te.next=temp.next;
		temp.next=null;
		temp=null;
	}
	public  void display()
	{
		temp=head;
		System.out.print("[ ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
		System.out.print("]");
		System.out.println();
	}
	


}