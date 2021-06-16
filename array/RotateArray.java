package array;
import java.util.Scanner;

class RotateArray {
	
	void rotationTime(int arr[], int time, int n)
	{
		for(int i=0;i<time;i++)
		{
			rotateByNo(arr,n);
		}	
	}
	 
	void rotateByNo(int[] arr, int n)
	{
		int i, temp;
		temp= arr[0];
		for(i=0; i<n-1; i++)
		{
			arr[i] = arr[i+1];
		}

		System.out.print(i);
		
			arr[i]=temp;
		
	}
	
	void printArray(int[] arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		RotateArray obj = new RotateArray();

		Scanner sc = new Scanner(System.in);
		System.out.println("array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter elements ");
		
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("how many time rotate");
		int time = sc.nextInt();	
		
		obj.rotationTime(arr,time,n);
		obj.printArray(arr, n);
		
	}
}
