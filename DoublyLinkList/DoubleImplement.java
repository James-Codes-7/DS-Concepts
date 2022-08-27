package org.doublyLink;

public class DoubleImplement {

	public static void main(String[] args) {
		
		DoublyLinkList<Integer> list=new DoublyLinkList<>();
		list.insertAtBegining(2);
		list.insertAtBegining(3);
		list.insertAtBegining(4);
		list.display();
		list.insertAtEnd(1);
		list.insertAtBegining(5);
		list.insertAtBegining(6);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteAtBegining();
		list.display();
		list.insertAtPos(2, 10);
		list.display();
		list.insertAtPos(5, 15);
		list.display();
		list.insertAtPos(7, 90);
		list.deleteAtEnd();
		list.display();
		list.insertAtBegining(19);
		list.insertAtEnd(23);
		list.display();
		list.deleteAtPos(3);
		list.display();
		
	}

}

