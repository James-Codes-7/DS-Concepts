package org.linklist1;

public class LinkedList <T>{

	public class Node
	{

		T data;
		Node next;
		public Node(T val)
		{
			data=val;
			next=null;
		}
	}
	private Node head,temp,tail;
	public LinkedList()
	{
		head=null;
		temp=null;
		tail=null;

	}
	public void get(int pos)
	{
		int i=0;
		temp=head;
		while(i<pos)
		{
			temp=temp.next;
			i++;
			if(temp==null)
			{
				System.out.println("Invalid pos");return;
			}
		}
		System.out.println(temp.data);
	}
	public void insertAtBegining(T val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			tail=head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void insertAtEnd(T val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			tail=head=newNode;return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	public void deleteAtBegining()
	{
		if(head.next==null||head==null)
		{
			head=null;return;
		}
		temp=head;
		head=head.next;
		temp=null;
	}
	public void deleteAtEnd()
	{
		if(head.next==null||head==null)
		{
			head=null;
			System.out.println("Delete and list empty");
			return;
		}
		temp=head;
		while(temp.next!=tail)
		{
			temp=temp.next;
		}
		temp.next=null;
		tail=null;
		tail=temp;
	}
	public void insertAtPos(int pos,T val)
	{
		Node newNode=new Node(val);
		temp=head;
		if(head==null)
		{
			head=tail=newNode;return;
		}
		int i=0;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
			if(temp==null)
			{
				System.out.println("Invalid position");
				return;
			}
		}
		newNode.next=temp.next;
		temp.next=newNode;

	}
	public void deleteAtPos(int pos)
	{
		Node te = null;
		int i=0;
		temp=head;
		if(pos==0)
		{
			this.deleteAtBegining();
			return;
		}
		while(i<pos)
		{
			te=temp;
			temp=temp.next;
			if(temp==null)
			{
				System.out.println("Invalid delete ");return;
			}
			i++;
		}
		if(temp==tail)
		{
			this.deleteAtEnd();return;
		}
		te.next=temp.next;
		temp=null;
	}
	public void display()
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
