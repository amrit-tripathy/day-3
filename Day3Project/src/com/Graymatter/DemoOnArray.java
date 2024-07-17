package com.Graymatter;

import java.util.Scanner;

public class DemoOnArray {
	
	public static boolean isprime(int ele) {
	    boolean flag = true;
	    if (ele <= 1) {
	        return false;
	    }
	    
	    int i = 2;
	    while (i <= Math.sqrt(ele)) {
	        if (ele % i == 0) {
	            flag = false;
	            break;
	        }
	        i++;
	    }
	    return flag;
	}

	public static void binsearch(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid =(high +low)/2;
			if(key==arr[mid]) {
				System.out.println("element found");
				break;
			}
			else if(key<arr[mid]) {
				high = mid-1;
			}
			else {
				low =mid+1;
			}
		}
		
	}
	public static int[] deletearr(int arr[],int ind) {
		int[] arr1=new int[arr.length-1];
		for(int i=0;i<ind;i++) {
			arr1[i]=arr[i];
		}
		for(int i=ind;i<arr1.length;i++) {
			arr1[ind]=arr[i+1];
		}
		
		return arr1;
	}

	public static int duplicates(int arr[],int key) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		return count;
		
	}
	public static int[] insert(int arr[],int ind,int key) {
		int[] arr1 = new int[arr.length+1];
		
		for(int i=0;i<ind;i++) {
			arr1[i]=arr[i];
		}
		arr1[ind]=key;
		for(int i=ind+1;i<arr1.length;i++) {
			arr1[i]=arr[i-1];
		}
		return arr1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		Scanner sc =new Scanner(System.in);
//		System.out.println("enter 5 elements");
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		for(int i=1;i<5;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//		
//		for(int i=0;i<arr1.length;i++) {
//			if(isprime(arr1[i])) {
//				System.out.println(arr1[i]);
//			}
//		}
//		binsearch(arr1,2);
		
//		System.out.println(duplicates(arr,7));
		
		int[] arr1=deletearr(arr,2);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		
		
		
		
		
		
		
	}

}
