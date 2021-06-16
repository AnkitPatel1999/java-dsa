package array;

import java.util.*;

public class SortByFrec {

	public static void SBF(List<Integer> list)
	{
		Map<Integer,Integer> map = new LinkedHashMap<>();
		int i;
		
		for(i=0;i<list.size();i++)
		{
			map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
		}
		System.out.println(map.toString());
		
		Collections.sort( list,(k1,k2)->{
			int freq1 = map.get(k1);
			int freq2 = map.get(k2);

			if(freq1!=freq2)	
			{
				return (freq2-freq1);
			}
			return (k1-k2);
		});
		
System.out.println(list);
	}
	
	public static void main(String[] args) {

		Integer[] arr = {1 ,3 ,7 ,7 ,7 ,3 ,2 ,2 ,2 ,7 ,3, 1 ,7 ,1 ,6 ,3, 5, 5, 4, 5, 6 ,2, 1, 2, 4, 7, 3, 1, 3, 5 ,4 ,1 ,7 ,2, 6 ,1 ,2};
	//	Integer[] arr = {4,4,5,6,7,2,1,1,2,2,1};
		List<Integer> list = Arrays.asList(arr);
		
		SBF(list);
		
	}

}
