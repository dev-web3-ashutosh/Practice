package com.ashutosh.corejava;

import java.util.Random;
import java.util.Stack;

public class StackDemo {
	Random rand=new Random();
	static Stack<Integer> stack=new Stack<Integer>();
	static int size;
	static int curr_pointer=-1;
	StackDemo(int size) {
		StackDemo.size=size;
		for(int i=0;i<size-1;i++) {
			stack.push(rand.nextInt(100));
		}
		System.out.println("Initial stack");
		printStack(stack);
	}
	
	

	public static void main(String[] args) {
		

	}

}
