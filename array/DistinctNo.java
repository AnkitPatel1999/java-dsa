package array;

import java.util.ArrayList;
import java.util.*;

public class DistinctNo {

	static ArrayList<Integer> distinct(ArrayList<Integer> arr, int k)
	{
		ArrayList<Integer> result = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		int len=arr.size();
		int i;
		
		for(i=0;i<k;i++)
		{
			map.put(arr.get(i),map.getOrDefault(arr.get(i), 0)+1);	
		}
		result.add(map.size());
		
		
		for(i=1;i<len-2;i++)
		{
			int removeEle = arr.get(i-1);
			int addEle = arr.get(i+k-1);
			
			removeElement(map,removeEle);
			
			map.put(addEle,map.getOrDefault(addEle,0)+1);
			
			result.add(map.size());
		}
	return result;
	}
	
	static void removeElement(Map<Integer,Integer> map, int removeEle)
	{
		int count = map.get(removeEle);
		
		if(count > 1)
		{
			map.put(removeEle,count-1);
		}else {
			map.remove(removeEle);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		int k=3;
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(6);
		
		System.out.println(arr);

		
		
		
		System.out.println(distinct(arr,k));
	}

}
