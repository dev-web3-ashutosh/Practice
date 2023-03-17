package com.ashutosh.corejava;

public class InsertionSortDemo2 {
	void insertionSort2(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while((j>=0)&&(arr[j]>key)) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println("Array during sorting:-");
			printArray(arr);
		}
	}
	void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr= {22,34,8,99,0};
		InsertionSortDemo2 obj=new InsertionSortDemo2();
		System.out.println("Array before sorting:-");
		obj.printArray(arr);
		System.out.println();
		obj.insertionSort2(arr);
		System.out.println();
		System.out.println("Sorted array:-");
		obj.printArray(arr);

	}

}
