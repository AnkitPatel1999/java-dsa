package array;

import java.util.*;
import java.util.Map.*;

public class printDuplicate {
	
	static void dup(int[] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();
		int i,c=0;

		for(i=0;i<5;i++)
		{
			if(map.containsKey(arr[i]))
			{
				c = map.get(arr[i]);
				map.put(arr[i],c+=1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		
		int flag=0;
		
		for(Entry<Integer,Integer> entries : map.entrySet())
		{
			if(entries.getValue() > 1)
			{
				System.out.println(entries);
				flag=1;
			}
		}
		
		if(flag==0)
		{
			System.out.print("-1");
		}

	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		dup(arr);
		
	}

}
