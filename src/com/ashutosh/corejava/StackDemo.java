package com.ashutosh.corejava;

import java.util.Stack;

public class StackDemo {
	
	void stackPush(Stack<Integer> stack, int e) {
		stack.push(e);
		System.out.println("Stack after adding element "+e+" (Bottom to Top)");
		printStack(stack);
	}
	
	void stackPop(Stack<Integer> stack) {
		if(stack.empty()==true) {
			System.out.println("Stack already empty");
		}
		else {
			int y=stack.pop();
			System.out.println("Stack after deleting element "+y+" (Bottom to Top)");
			printStack(stack);
		}
	}
	
	void printStack(Stack<Integer> stack) {
		Stack<Integer> temp=new Stack<Integer>();
		while(stack.empty()==false) {
			temp.push(stack.peek());
			stack.pop();
		}
		while(temp.empty()==false) {
			int t=temp.peek();
			System.out.print(t+" ");
			temp.pop();
			stack.push(t);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackDemo obj=new StackDemo();
		Stack<Integer> stack=new Stack<Integer>();
		obj.stackPush(stack,33);
		obj.stackPush(stack,21);
		obj.stackPush(stack,167);
		obj.stackPop(stack);
	}

}
