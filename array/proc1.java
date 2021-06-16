package array;

import java.util.HashMap;

public class proc1 {

	public static void main(String[] args) {
		int i,j,sum=0,s=15;
		int[] arr = { 2,5,5,1,2,10,5};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			map.put(i,sum );
		}
		
		for(i=0;i<arr.length;i++)
		{
			if(map.containsValue(s))
			{
				while() {
					System.out.println(arr[i]);
					
				}
			}
		}
		
		System.out.println(map);
	}

}
