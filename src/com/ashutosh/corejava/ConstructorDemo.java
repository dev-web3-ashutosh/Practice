package com.ashutosh.corejava;

public class ConstructorDemo {
	ConstructorDemo() {
		System.out.println("I am a default constructor.");
	}
	ConstructorDemo(int a, float f, String s, char c) {
		System.out.println("Square of integer value is "+a*a);
		System.out.println("Square of float value is "+f*f);
		System.out.println("String is "+s);
		System.out.println("Character is "+c);
	}
	public static void main(String[] args) {
		System.out.println("By method 1:-");
		ConstructorDemo obj1=new ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo(2,3.0f,"Ashu",'S');
		System.out.println("\nBy method 2:-");
		ConstructorDemo obj3, obj4;
		obj3=new ConstructorDemo();
		obj4=new ConstructorDemo(2,3.0f,"Ashu",'S');

	}

}
