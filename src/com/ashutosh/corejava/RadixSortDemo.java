package com.ashutosh.corejava;

public class RadixSortDemo {
	
	int getMax(int[] arr, int n) {
		int max=arr[0];
		for(int i=1;i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		

	}

}
