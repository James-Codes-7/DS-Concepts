package org.stack;

public class Sample {

	public static void main(String[] args) {
	
		Stack<Object> stack=new Stack<>();
		
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(6);
		System.out.println(stack.pop());
		stack.push(7);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(9);
		System.out.println(stack.pop());
		stack.push("James");
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		

	}

}
