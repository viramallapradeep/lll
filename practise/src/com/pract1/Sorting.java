package com.pract1;

import java.util.Arrays;

public class Sorting {

	
	//bubble sort
	
	public  void bs(int []ar) {
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 1; j < ar.length-i; j++) {
				if(ar[j-1]>ar[j]) {
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
				
			}
			
		}
		
	}
	
	//quick sort
	public void qs(int a[],int low,int high) {
		
		
		int pivot=a[low+(high-low)/2];
		int i=low,j=high;
		
		while(i<=j) {
			
			
			
		while (a[i] < pivot) {
			i++;
		}
		
		while(a[j]>pivot) {
			j--;
			
		}
		
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		
		if(low<j)
		
			qs(a, low, j);
		
		if(high>i)
			
			qs(a, i, high);
		
		}
		
		
	}
	
	private int removeDuplicates(int a[]) {
		
		int temp[]= new int[a.length];
		int j=0;
		for (int i = 0; i< a.length-1; i++) {

			if (a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
			
		}
		
		temp[j++]=a[a.length-1];
		
		for (int i = 0; i < j; i++) {
			a[i]=temp[i];
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		 Sorting name = new Sorting();
		 
		 int a[]= {2,1,45,43,4354,2,345,22,2,53,5,345,45,2,2345,2,34,4,2,255,6,23,6,423,7,8,8,9,4,53,6653546,4,6653546,6653546};
		 
		 System.out.println("before sort"+Arrays.toString(a));
		 
		// name.qs(a,0,a.length-1);
		// System.out.println("after sort"+Arrays.toString(a));
		 
		// name.dr(a);
		// System.out.println("after duplicates removal"+Arrays.toString(a));
		 
		 
		 

	}

}
