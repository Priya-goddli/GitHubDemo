package com.hub;
import java.util.*;
public class GithubDemo {

	public static void main(String[] args)throws Exception {
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ele pos");
		Integer n=sc.nextInt();
		
	    List<Integer> l=new ArrayList<Integer>();
	    l.add(sc.nextInt());
	    Integer nresult=d.resultmethod(l,n);
	    System.out.println(nresult);
	    
	}
}
class Demo
{
	Integer resultmethod(List<Integer> a,Integer n)
	{
		Integer[] arr1=new Integer[a.size()];
		arr1=a.toArray(arr1);	
		List<Integer> ll=new ArrayList<Integer>();
		Integer[] arr=new Integer[a.size()];
		
		for(int i=1;i<n;i++)
		{	
			arr[i]=arr1[i-1];
			if(i==n-1)
			{
				arr[0]=arr[n-1];
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		
		return 0;
	}
}
