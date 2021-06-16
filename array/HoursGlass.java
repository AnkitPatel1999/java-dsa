package array;

public class HoursGlass {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int i=0,j=0,sum=0;
		
		
		sum=a[i][j]+a[i][j+1]+a[i][j+2]+
				a[i+1][j+1]+
				a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
		System.out.println(sum);
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"  "+ "i"+i+"j"+j+"  ");
			}
			System.out.println();
		}
		

		
	}

}
