package com.ashutosh.corejava;

import java.util.Scanner;

public class InsertionSortDemo {
	void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;++i) {
			int key=arr[i];
			int j=i-1;
			while((j>=0)&&(arr[j]>key)) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	void print(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int  n;
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;++i) {
			System.out.println("Enter element number "+(i+1));
			arr[i]=sc.nextInt();
		}
		InsertionSortDemo obj=new InsertionSortDemo();
		System.out.println("Array before sorting");
		obj.print(arr);
		//sorting array
		obj.insertionSort(arr);
		System.out.println("Array after sorting");
		obj.print(arr);
		

	}

}
