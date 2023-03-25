package com.ashutosh.corejava;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	Random rand=new Random();
	static Stack<Integer> stack=new Stack<Integer>();
	
	void stackPush(int e) {
		stack.push(e);
		System.out.println("Stack after adding element "+e+" (Bottom to Top)");
		printStack(stack);
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
		obj.stackPush(33);
		obj.stackPush(21);
		obj.stackPush(167);
	}

}
