package org.queue;

public class QueueImplement {

	public static void main(String[] args) {
	
		Queue<Integer> oue=new Queue<>();
		
		oue.enqueue(23);
		oue.enqueue(34);
		oue.enqueue(45);
		oue.enqueue(56);
		System.out.println(oue.dequeue());
		System.out.println(oue.isEmpty());
		System.out.println(oue.dequeue());
		System.out.println(oue.dequeue());
		System.out.println(oue.dequeue());
		System.out.println(oue.dequeue());
		System.out.println(oue.isEmpty());
		oue.enqueue(67);
		oue.enqueue(78);
		oue.enqueue(90);
		System.out.println(oue.dequeue());
	}

}
