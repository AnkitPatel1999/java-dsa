package array;

public class bubbleSort {

	public static void main(String[] args) {
		
		int a[] = {2,4,5,7,2};
		int n=a.length;
		int i,j,temp=0;
		
		for(i=0;i<n-1;i++)
		{
			boolean sorted=true;
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		
		for(int data:a)
		{
			System.out.print(data+" ");
		}
	}

}
