package org.linklist1;

public class LinkImplement {

	public static void main(String[] args) {
		
		LinkedList<Object> list=new LinkedList<>();
		list.insertAtBegining("kam");
		list.insertAtBegining("james");
		list.insertAtEnd(7);
		list.insertAtEnd("bond");
		list.insertAtBegining(1);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.insertAtPos(2, "bond");
		list.display();
		list.insertAtPos(5, 11);
		list.display();
		list.insertAtPos(7, 23);
		list.display();
		list.deleteAtPos(6);
		list.display();
		list.deleteAtPos(0);
		list.display();
		list.deleteAtPos(1);
		list.display();
		list.insertAtEnd("Shiv");
		list.insertAtBegining("torget");
        list.display();
        list.get(1);
	}  
/*
 * [ 1 james kam 7 bond ]
[ 1 james kam 7 ]
[ 1 james bond kam 7 ]
[ 1 james bond kam 7 11 ]
Invalid position
[ 1 james bond kam 7 11 ]
Invalid delete 
[ 1 james bond kam 7 11 ]
[ james bond kam 7 11 ]
[ james kam 7 11 ]
[ torget james kam 7 Shiv ]
james

 */
}
