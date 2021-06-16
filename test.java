import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int i,n = 0,mid=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] = new int[n];
		for( i =0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		mid=n/2;
	System.out.println("mid"+mid);

        int upHalf[] = new int[n];
        int downHalf[] = new int[n];
        int k=0;
        for(i=0;i<mid;i++)
        {
            upHalf[k] = a[i];
            k++;
        }
        int j=0;
        for(i=mid;i<n;i++)
        {
            downHalf[j] = a[i];
            j++;
        }
       
        
        
        for(i=0;i<k;i++)
        {
        	System.out.println(upHalf[i]);
        }
        
        for(i=0;i<j;i++)
        {
        	System.out.println(downHalf[i]);
        }
		
		
	}

}
