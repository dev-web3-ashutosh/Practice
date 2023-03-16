package com.ashutosh.corejava;

public class QuickSortDemo {
	int partition(int[] arr, int l, int h) {
		int pivot=arr[h];
		int j=l-1;
		for(int i=0;i<h;++i) {
			if(arr[i]<pivot) {
				j++;
				swap(arr,i,j);
			}
			swap(arr,j+1,h);
			return (j+1);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
