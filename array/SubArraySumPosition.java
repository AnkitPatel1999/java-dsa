package array;

import java.util.*;

public class SubArraySumPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n+1];
			int i;
			for(i=1;i<=n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			Map<Integer,Integer> map = new LinkedHashMap<>();
			int sum=0;
			int index=0;
			map.put(0,0);
			for(i=1;i<=n;i++)
			{
				sum+=arr[i];
				
				
					map.put(sum,i);
				
				
				if(map.containsKey(sum-k))
				{
					index = map.get(sum-k)+1;
					System.out.println(index+" to "+i);
					break;
				}
				
			}
			if(index==0)
			{
				System.out.println(-1);
			}
			System.out.print(map);

		}
		
	}
}
