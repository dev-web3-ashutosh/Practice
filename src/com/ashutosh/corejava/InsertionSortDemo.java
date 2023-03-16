package com.ashutosh.corejava;

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
		

	}

}
