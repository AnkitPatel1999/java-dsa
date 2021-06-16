package array;

import java.util.*;

public class CommanElements {

	public static void main(String[] args) {
		Integer[] a1 = {1,2,4,5,6,3,2,33};
		Integer[] a2 = {1,6,3,2,33};
		Integer[] a3 = {1,2,55,66,77,88,22,22,211,33,222};
		Scanner sc = new Scanner(System.in);
		int s=5;
		/*
		 * Integer[] x = new Integer[s]; for(int j=0;j<s;j++) { x[j]=sc.nextInt(); }
		 * for(int g:x) { System.out.print(g); }
		 */
		Set<Integer> set1 = new HashSet<>(Arrays.asList(a1));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(a2));
		Set<Integer> set3 = new HashSet<>(Arrays.asList(a3));
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
	

		set1.retainAll(set2);
		set1.retainAll(set3);
		
		int length=set1.size();
        if(length>=1){
            Iterator<Integer> i = set1.iterator(); 
		       while (i.hasNext())
		           System.out.print(i.next()+" ");   
        }
        else{
            System.out.print("-1");
        }
	}

}
