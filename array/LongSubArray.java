package array;

import java.util.*;

public class LongSubArray {

	static void LSA(int[] arr, int k)
	{
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0,max=0;
		int i,len=arr.length;
		map.put(0,-1);
		for(i=0;i<len;i++)
		{
			sum+=arr[i];
			System.out.println(sum+" "+i);
			if(!map.containsKey(sum))
			{
				map.put(sum,i);
			}
						
			if(map.containsKey(sum))
			{
				int index = map.get(sum)+1;
				if(max<i-index)
				{
					max=i-index+1;
					
				}
			}
			
		}
			
		
		System.out.println(map.toString());
		System.out.println(max);
	}
	
	public static void main(String[] args) {

		int[] arr = {15,-1,-14,3,6,-1,-4,-1,8};
		int k=11;
		LSA(arr,k);
	}

}
