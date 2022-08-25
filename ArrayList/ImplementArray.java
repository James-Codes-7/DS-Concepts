package org.arraylist;

import java.util.Scanner;

public class ImplementArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		ArrayList list=new ArrayList();

		boolean bool=true;
		while(bool)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("   Insert the element press 1\n"
					+          "   Delete  the element press 2\n"
					+          "   Insert the element with postition press 3\n"
					+          "   Delete the element with position press 4\n"
					+          "   Display press 5\n"
					+          "   It Contains press 6\n"
					+          "   Get press 7\n"
					+          "   Update press 8\n"
					+          "   Exit press 9\n");
			System.out.println("-------------------------------------------------");
			System.out.println("Enter the Option");
			int opt=scan.nextInt();
			if(opt==9) {list.capacityCheck(); break;}
			switch(opt)
			{
			case 1:System.out.println("Enter the element");
			int val=scan.nextInt();
			list.add(val);break;
			case 2:list.remove();
			break;
			case 3:System.out.println("Enter the pos and value");
			int pos=scan.nextInt();
			val=scan.nextInt();
			list.add(pos, val);
			break;
			case 4:System.out.println("Enter the position");
			pos=scan.nextInt();
			list.delete(pos);
			break;
			case 5:list.display();
			break;
			case 6: System.out.println("Enter the values");
			val=scan.nextInt();
			System.out.println( list.contains(val));
			break;
			case 7:System.out.println("Enter the Index");
			pos=scan.nextInt();
			list.get(pos);
			break;
			case 8:System.out.println("Enter the position and value");
			pos=scan.nextInt();
			val=scan.nextInt();
			list.update(pos, val);
			break;

			}
		}

	}

}
