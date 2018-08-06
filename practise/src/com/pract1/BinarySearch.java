package com.pract1;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static void QS(int a[],int low,int high) {
		
		int mid=a[ low+(high-low)/2 ];
		int i=low,j=high;
		
		while (i <= j) {
			
			while (mid > a[i]) {
				i++;
			}
			
			while (mid < a[j]) {
				j--;
				
			}
			
			if(i <= j) {
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			
		}
		
		if(low<j)
			QS(a,low,j);
			
			
		if(high>i)
			QS(a,i,high);
		
		
	}
	
	public static void BS(int a[],int key) {
		int low=0, high =a.length-1;
		
		int pivot = (low+high)/2;
		
		while (low<=high) {
			
			if (key > a[pivot]) {
				low=pivot+1;
				
			} else if(a[pivot]==key){
				System.out.println( key +" found at "+pivot);
				break;

			}else {
				high=pivot-1;
			}
			pivot = (low+high)/2;
			
		}
		
		
		if(low>high)
			System.out.println("not fount");
		
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {1 ,34,34,342,23,23,46,4,3,88,434,45,22,5,75,86,9,679769,80,0};
		QS(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		
		BS(a, 23);
		
		
	}

}
