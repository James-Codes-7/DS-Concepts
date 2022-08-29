package org.stack;

import java.util.Arrays;

public final class Stack<E>  {

	private E arr[];
	private final int initialCapacity;
	private  int capacity;
	private int top;
	@SuppressWarnings("unchecked")
	public  Stack()
	{
		initialCapacity=16;
		capacity=initialCapacity;
		top=-1;
		arr=(E[]) new Object[initialCapacity];

	}
	private void expandSize()
	{
	
	arr=Arrays.copyOf(arr, capacity);
	}
	public void push(E val) {

		if(top==capacity-1)
		{
			capacity*=2;
			this.expandSize();
		}
	    arr[++top]=val;

	}
	public E pop()
	{
	
		if(top==-1)
		{
			throw new IndexOutOfBoundsException("The  stack underflow");
		}
	
		if(capacity>initialCapacity&&capacity>3*top)
		{
			capacity/=2;
			this.expandSize();
		}
		return arr[top--];
	}
	public E peek()
	{
		return arr[top];
	}
    public boolean isEmpty()
    {
    	return top==-1;
    }
}
