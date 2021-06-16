package array;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
		
		int[] arr= {0,0,1,2,-3,6,7,1,1,1,1,1,5};
		int i,sum=0,max=0;
		
		Map<Integer,Integer> map = new HashMap<>();
		for(i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 && max==0)
			{
				max=1;
			}
			if(sum==0)
			{
				max=i+1;
			}

			if(map.containsKey(sum))
			{
				int index = map.get(sum)+1;
					max=Math.max(max,i- map.get(sum));
			}
			else {
				map.put(sum,i);
			}		
		}
		System.out.println(max);	
	}
}   