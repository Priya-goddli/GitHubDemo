package com.hub;
import java.util.Scanner;
public class ArrayArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		System.out.println("k");
		int k=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		b[0]=a[k-1];
		for(int i=1;i<k;i++)
		{
			b[i]=a[i-1];
		}
		for(int i=k;i<n;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
			
		}

	}

}
