package org.arraylist1;

import java.util.Iterator;



public class SamPle {

	String name;
	int id;
	public SamPle(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		

		ArrayList<Object> list=new ArrayList<>();
		list.add(2);
		list.add("james");
		list.add(5.8);
		list.add('u');
		list.add(true);
		list.display();
		list.get(1);
		list.add(2, "jamesbond");
		list.display();
		list.delete(1);
		list.display();
		list.add(10);
		list.contains(10);
		list.display();
		ArrayList<SamPle> l=new ArrayList<>();
		l.add(new SamPle("James",1000));
		for(SamPle k:l)
		{
			System.out.println(k.id+" "+k.name);
		}
		l.get(0);
		
		Iterator<Object> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(Object g:list)
		{
			System.out.println(g);
		}
		
		
	}

}
