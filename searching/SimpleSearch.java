package searching;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSearch {
	
	public int  search(int[] a, int n, int x) {
		
		int low=0, high=n-1,mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(a[mid] == x)
			{
				return mid+1;
			}
			if(x>a[mid])
			{
				low = mid + 1;
			}
			if(x<a[mid])
			{
				high=mid-1;
			}
		}
		
		return -1;		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		SimpleSearch obj = new SimpleSearch();
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter seached elememt ");
		int x = sc.nextInt();
		int ans=obj.search(a,n,x);
		System.out.println(ans);
		

	}

}
