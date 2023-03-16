package com.ashutosh.corejava;

import java.util.Scanner;

public class MergeSortDemo {
	void merge(int[] arr, int l, int m, int r) {
		int n1=m-l+1;
		int n2=r-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;++i) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<n2;++i) {
			R[i]=arr[m+1+i];
		}
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
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
	
	void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int m=(l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	void print2(int[] arr) {
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
		MergeSortDemo obj=new MergeSortDemo();
		System.out.println("Array before sorting");
		obj.print2(arr);
		//sorting array
		int l=0;
		int r=n-1;
		obj.mergeSort(arr,l,r);
		System.out.println("Array after sorting");
		obj.print2(arr);
		sc.close();

	}

}
