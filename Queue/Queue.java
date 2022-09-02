package org.queue;

public final class Queue<T> {

	public final class Node
	{
		private T data;
		private Node next;
		
		public Node(T val)
		{
			data=val;
			next=null;
		}
		
	}
	
	private Node head,tail,temp,newNode;
	public Queue()
	{
		head=null;
		tail=null;
		temp=null;
		newNode=null;
	}
	
	public void enqueue(T val)
	{
		newNode=new Node(val);
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
		
	}
	public T dequeue()
	{
		if(head==null)
		{
			System.out.println("No elemenents ");return null;
		}
		temp=head;
		head=head.next;
		return temp.data;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
}
