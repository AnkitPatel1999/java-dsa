package array;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindows2 {
	
	 public static int[] maxSlidingWindow(int[] nums, int k) {
	        int[] sliding = new int[nums.length-k+1];
	        Deque<Integer> dq = new LinkedList<>();
	        int index = 0;
	        // queue is sorted from last to first, first is max element
	        for (int i = 0; i < nums.length; i++) {
	            // discard older elements which are less or equal than current
	            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
	                dq.removeLast();
	            }
	            // discard element which are out of current window
	            while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
	                // this loop will execute only once
	                dq.removeFirst();
	            }
	            // add the element in the valid queue
	            dq.addLast(i);
	            if (i >= k-1) {
	                // since queue is sorted from last to first, first is the max element
	                sliding[index++] = nums[dq.peekFirst()];
	            } 
	        }
	        return sliding;
	    }

	public static void main(String[] args) {

		int i=0;
		int[] a = {44,500,100,22,3,8,5,7};
		int k=3;
		int[] ans = maxSlidingWindow(a,k);
		
		for(i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
		
		
		
	}

}
