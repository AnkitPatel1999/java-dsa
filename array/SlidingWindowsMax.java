package array;

import java.util.*;

public class SlidingWindowsMax {
	
	static int[] SWM(int[] a, int k)
	{
		int i,len=a.length;
		Deque<Integer> dq = new LinkedList<>();
		
		if(len<=1){
			return a;
		}
		
		int[] ans = new int[len-k+1];
				
		for(i=0;i<k;i++)
		{
			while(!dq.isEmpty() && a[dq.peekFirst()] <= a[i])
			{
				dq.removeLast();
			}
			dq.addLast(i);
		}
		
		for(i=k;i<len;i++)
		{
			ans[i-k] = a[dq.peekFirst()];
			while(!dq.isEmpty() && dq.peekFirst() <= i-k)
			{
				dq.removeFirst();
			}
			while(!dq.isEmpty() && a[dq.peekLast()]<= a[i])
			{
				dq.removeLast();
			}
			dq.addLast(i);
		}
		ans[i-k] = a[dq.peekFirst()];
		
		return ans;
	}
	

	public static void main(String[] args) {
		
		int[] a = {1 ,2 ,3 ,1, 4 ,5 ,2 ,3 ,6};
		int k=3;
	
		
		
		int ans[] = SWM(a,k);		
		
		for(int x:ans)
		{
			System.out.println(x);
		}
		
	}

}
