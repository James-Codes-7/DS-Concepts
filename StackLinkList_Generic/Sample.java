package org.stack1;

public class Sample {

	public static void main(String[] args) {
		
		Stack<Object> stack =new Stack<>();
		
		stack.push(9);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push("James");
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("hjls");
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	   
		try{Thread.sleep(3500);}catch(Exception e) {}
		System.out.println("Bye");
	}

}
