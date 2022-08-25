package org.arraylist1;

import java.util.Arrays;
import java.util.Iterator;

public final class ArrayList<T>implements Iterable<T>  {

	private T[] arr;
	private  int size;
	private int capacity;
	private  int initialCapacity=16;
	@SuppressWarnings("unchecked")
	public ArrayList()
	{
		size=0;
		capacity=initialCapacity;
		arr=(T[])new Object[initialCapacity];
	}
	private void sizeExpand()
	{
		arr=Arrays.copyOf(arr, capacity);
	}
	private void capacityCheck()
	{
		if(capacity>initialCapacity&&capacity>size*3)
		{
			capacity/=2;
			this.sizeExpand(); 
		}
	}
	public void add(T val)
	{
		if(size==capacity)
		{  capacity*=2;
		this.sizeExpand();
		}
		arr[size++]=val;
	}

	public void delete()
	{
		if(size==-1) {System.out.println("No more");return;}

		size--;
		this.capacityCheck();
	}
	public void add(int pos,T val)
	{
		if(size==capacity)
		{
			capacity*=2;
			this.sizeExpand();
		}
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i]; 
		}
		arr[pos]=val;
		size++;

	}
	public void delete(int pos)
	{
		for(int i=pos;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		this.capacityCheck();
	}
	public void get(int pos)
	{
		if(pos>=size) {System.out.println("No get");return;}
		System.out.println(arr[pos]);
	}
	public void Update(int pos,T val)
	{
		if(pos<size)
			arr[pos]=val;
		else
			System.out.println("Not Update");
	}
	public void contains(T val)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("true");return;
			}
		}
		System.out.println("false");
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
	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>()
		{

			private int index=0;
			@Override
			public boolean hasNext() {

				return index<size;
			}

			@Override
			public T next() {

				return arr[index++];
			}

		};
	}



}
