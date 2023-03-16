package com.ashutosh.corejava;

import java.util.Scanner;

public class QuickSortDemo {
	int partition(int[] arr, int l, int h) {
		int pivot=arr[h];
		int j=l-1;
		for(int i=0;i<h;++i) {
			if(arr[i]<pivot) {
				j++;
				swap(arr,i,j);
			}
		}
		swap(arr,j+1,h);
		return (j+1);
	}
	
	void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p=partition(arr,l,h);
			quickSort(arr,l,p-1);
			quickSort(arr,p+1,h);
		}
	}
	
	void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	void print3(int[] arr) {
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
		QuickSortDemo obj=new QuickSortDemo();
		System.out.println("Array before sorting");
		obj.print3(arr);
		//sorting array
		int l=0;
		int h=n-1;
		obj.quickSort(arr,l,h);
		System.out.println("Array after sorting");
		obj.print3(arr);
		sc.close();


	}

}
