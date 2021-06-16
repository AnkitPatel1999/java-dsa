package searching;

import java.util.Scanner;

public class MissingNo {
	
	public static int no(int[] a,int n)
	{
		int i,sum;
		sum = (n+1)*(n+2)/2;
		
		for(i=0;i<n;i++) {
			sum=sum-a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(no(a,n));
		
	}

}
