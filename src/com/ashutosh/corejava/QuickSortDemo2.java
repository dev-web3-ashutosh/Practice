package com.ashutosh.corejava;

public class QuickSortDemo2 {
	void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	int partition(int[] arr, int l, int h) {
		int pivot=arr[h];
		int j=l-1;
		for(int i=0;i<h;i++) {
			if(arr[i]>pivot) {
				j++;
				swap(arr,i,j);
			}
		}
		swap(arr,(j+1),h);
		return (j+1);
	}
	
	void quickSort2(int[] arr, int l, int h) {
		if(l<h) {
			int p=partition(arr,l,h);
			quickSort2(arr,l,p-1);
			quickSort2(arr,p+1,h);
		}
	}

	public static void main(String[] args) {
		

	}

}
