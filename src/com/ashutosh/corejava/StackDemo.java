package com.ashutosh.corejava;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	Random rand=new Random();
	static Stack<Integer> stack=new Stack<Integer>();
	static int size=stack.size();
	static int curr_pointer=-1;
	
	
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
		
	}

}
