package com.ashutosh.corejava;

import java.util.Arrays;

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
	
	void countSort(int[] arr, int n, int e) {
		int[] output=new int[n];
		int[] count=new int[10];
		Arrays.fill(arr, e);
		int i;
		
		for(i=0;i<n;i++) {
			count[(arr[i]/e)%10]++;
		}
		
		for(i=1;i<10;i++) {
			count[i]+=count[i-1];
		}
		
		
	}

	public static void main(String[] args) {
		

	}

}
