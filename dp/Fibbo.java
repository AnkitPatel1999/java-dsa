package dp;

public class Fibbo {
	
	public int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}

		return n=fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {

		Fibbo obj  = new Fibbo();
		
		System.out.print(obj.fib(5));
		
	}

}
