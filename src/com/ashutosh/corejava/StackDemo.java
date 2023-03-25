package com.ashutosh.corejava;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	Random rand=new Random();
	static Stack<Integer> stack=new Stack<Integer>();
	static int size;
	static int curr_pointer=-1;
	StackDemo(int size) {
		StackDemo.size=size;
		for(int i=0;i<size;i++) {
			stack.push(rand.nextInt(100));
			curr_pointer++;
		}
		System.out.println("Initial stack");
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
		System.out.println("Enter size of the stack");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		StackDemo obj=new StackDemo(size);

	}

}
