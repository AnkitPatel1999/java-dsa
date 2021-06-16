package array;

import java.util.*;
import java.util.Map.*;

public class RelativeSorting {

	static void fun(int[] a1,int[] a2)
	{
		Map<Integer,Integer> map = new HashMap<>();
		int[] ans = new int[a1.length];
		int i;
		
	
		for(i=0;i<a1.length;i++)
		{
			if(map.containsKey(a1[i]))
			{
				map.put(a1[i],map.get(a1[i])+1);
			}else {
				map.put(a1[i],1);
			}
		}
		
		i=0;
		int c=0;
		int len=a2.length;
		while(len!=0)
		{
			if(map.containsKey(a2[i]))
			{
				while(map.get(a2[i])>0)
				{
					ans[c] = a2[i];
					map.put(a2[i],map.get(a2[i])-1);
					c++;
				}
			
				map.remove(a2[i]);
			
			}
			len--;
			i++;
		}

		TreeMap<Integer,Integer> tm = new TreeMap<>(map);
		//tm.putAll(map);
		System.out.println(tm);
		
		for(Map.Entry<Integer,Integer> entries: tm.entrySet()) {
			while(entries.getValue() > 0)
			{
				ans[c]=entries.getKey();
				tm.put(entries.getKey(), entries.getValue()-1);
				c++;
			}
		}
		
		for(int x:ans)
		{
			System.out.print(x+" ");
		}

		
	}
	
	public static void main(String[] args) {
		
		int[] a1 = {9 ,8 ,5 ,0 ,3, 8 ,9, 0};
		int[] a2 = {9};
		
		fun(a1,a2);
	}

}
