package dp;

public class Square {
	
	public int squareRoot(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		return n=n * squareRoot(n-1);
		
		
	}

	public static void main(String[] args) {
		Square obj = new Square();
		int sum;
		sum = obj.squareRoot(5);
		
		System.out.println(sum);
		
	}

}
