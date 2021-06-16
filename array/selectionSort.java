package array;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		
		int a[] = {6,5,4,7,1};
		int i,j = 0,temp=0,n=5;
		int minIndex;
		
		
	
		for(i=0; i<n-1;i++)
		{	
			minIndex=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j] < a[minIndex])
				{
					minIndex = j;	
				}				
			}
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		
		
		
		
		
		for(int item: a)
		{
			System.out.print(item+ " ");
		}
		
	}

}
