package org.arraylist;

import java.util.Arrays;

public final class ArrayList {

	private int arr[];
	private int size;
	private int capacity;
	private final int initialCapacity=3;
	public ArrayList()
	{
		arr=new int[initialCapacity];
		size=0;
		capacity=initialCapacity;
	}
	public boolean contains(int val)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]==val)
			{
				return true;
			}
		}
		return false;
	}
	public void capacityCheck()
	{
		System.out.println(capacity);
	}
	public void add(int val)
	{
		if(size==capacity)
		{
			capacity*=2;
			arr=Arrays.copyOf(arr, capacity);
		}
		arr[size++]=val;
	}
	public void get(int pos)
	{
		System.out.println(arr[pos]);
	}
	public void update(int pos,int val)
	{
	    if(pos>=size) { System.out.println("Not update");return;}
	    arr[pos]=val;
	}
	public void remove()
	{
		if(size==-1)
			{System.out.println("Empty list");return;}
		
		size--;
		if(capacity>initialCapacity&&capacity>3*size)
		{
			capacity/=2;
			arr=Arrays.copyOf(arr, capacity);
		}
			
	}
	public void add(int pos,int val)
	{
		if(size==capacity)
		{
			capacity*=2;
			arr=Arrays.copyOf(arr,capacity);
		}
	
		if(pos>size) {System.out.println("Not correct "); return;}
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
	}
	public void delete(int pos)
	{
		if(pos>=size) {System.out.println("Not delete");return;}
		for(int i=pos;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		if(capacity>initialCapacity && capacity>5*size)
		{
			capacity/=2;
			arr=Arrays.copyOf(arr, capacity);
			
		}
	}
	public void display()
	{
		System.out.print("[ ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	
	
}
