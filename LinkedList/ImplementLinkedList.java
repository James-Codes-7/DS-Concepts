package org.linkedlist;

public class ImplementLinkedList {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.insertAtBegining(2);
		list.insertAtBegining(3);
		list.insertAtEnd(4);
		list.insertAtBegining(7);
		list.insertAtEnd(9);
		list.display();
		
		list.deleteAtBegining();
		list.display();
		list.deleteAtEnd();
		list.display();
		list.insertAtBegining(1);
		list.insertAtBegining(2);
		list.display();
		list.insertAtPos(2, 5);
		list.display();
		list.deleteAtPos(2)
		;
		list.display();
		list.insertAtPos(5, 5);
		list.display();
		list.deleteAtEnd();
		list.deleteAtEnd();
		list.display();
		list.deleteAtPos(3);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteAtBegining();
		list.display();
		list.insertAtPos(1, 2);
		list.display();
		list.deleteAtBegining();
		list.deleteAtBegining();
		list.display();
	}

}
