package org.stack1;

public class Stack<E> {

	public final class Node
	{
		private E data;
		private Node next;

		public Node(E val)
		{
			data=val;
			next=null;
		}
	}
	private Node head,temp,tail,newNode;

	public Stack()
	{
		head=null;
		temp=null;
		tail=null;
		newNode=null;
	}

	public void push(E val)
	{
		newNode= new Node(val);
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
	public E pop()
	{
		if(head==null)
		{
			throw new IndexOutOfBoundsException("Stack Underflow");
		}
		if(head.next==null)
		{
			E data= head.data;
			head=null;
			tail=null;
			return data;
		}
		temp=head;
		while(temp.next!=tail)
		{
			temp=temp.next;
		}
		E data =tail.data;
		temp.next=null;
		tail=null;
		tail=temp;
		return data;
	}
	public E peek()
	{
		if(tail==null)
		{
			throw new IndexOutOfBoundsException("Stack Empty");
		}
		return tail.data;

	}

	public boolean isEmpty()
	{
		return  head==null;
	}


}
