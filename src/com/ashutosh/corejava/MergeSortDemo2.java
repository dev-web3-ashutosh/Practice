package com.ashutosh.corejava;

public class MergeSortDemo2 {
	void merge2(int[] arr, int l, int m, int r) {
		int n1=m-l+1;
		int n2=r-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			R[i]=arr[m+1+i];
		}
		int i=0,j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
	void mergeSort2(int[] arr, int l, int r) {
		if(l<r) {
			int m=(l+r)/2;
			mergeSort2(arr,l,m);
			mergeSort2(arr,m+1,r);
			merge2(arr,l,m,r);
		}
	}
	
	void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MergeSortDemo2 obj=new MergeSortDemo2();
		int[] arr= {22,34,8,99,0};
		int n=arr.length;
		int l=0;
		int r=n-1;
		System.out.println("Array before sorting:-");
		obj.printArray(arr,n);
		System.out.println();
		obj.mergeSort2(arr,l,r);
		System.out.println();
		System.out.println("Sorted array:-");
		obj.printArray(arr,n);
	}

}
