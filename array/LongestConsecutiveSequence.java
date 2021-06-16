package array;

import java.util.*;

public class LongestConsecutiveSequence {

	static void LCS(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		int i=0,longest=0,cur,ans=0;
		int l=arr.length;
		
		for(i=0;i<l;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
		
		for(i=0;i<l;i++)
		{
			if(!set.contains(arr[i]-1))
			{
				cur=arr[i];
				longest=0;
				while(set.contains(cur))
				{
					cur++;
					longest++;
				}
				
				if(ans<longest)
					ans=longest;
			}
		}
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,8,2,4,12,1,11,3};
		LCS(arr);
	}

}
