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
		Arrays.fill(count, 0);
		int i;
		
		for(i=0;i<n;i++) {
			count[(arr[i]/e)%10]++;
		}
		
		for(i=1;i<10;i++) {
			count[i]+=count[i-1];
		}
		
		for(i=n-1;i>=0;i--) {
			output[count[(arr[i]/e)%10]-1]=arr[i];
			count[(arr[i]/e)%10]--;
		}
		
		for(i=0;i<n;i++) {
			arr[i]=output[i];
		}
	}
	
	void radixSort(int[] arr, int n) {
		int m=getMax(arr,n);
		for(int e=1;(m/e)>0;e*=10) {
			countSort(arr,n,e);
		}
	}
	
	void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RadixSortDemo obj=new RadixSortDemo();
		int[] arr= {22,34,66,8,99,0,66};
		int n=arr.length;
		System.out.println("Array before sorting:-");
		obj.printArray(arr,n);
		System.out.println();
		obj.radixSort(arr,n);
		System.out.println();
		System.out.println("Sorted array:-");
		obj.printArray(arr,n);

	}

}
