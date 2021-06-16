package array;

public class fun {
	
	public void fun1(int n) {
		int i=0;
		int f1=0,f2=1,f3=0;
		for(i=0; i<n;i++)
		{
			f1 = f2;
			f2 = f3; 
			f3 = f1+f2;
			System.out.print(f3 );
		}
	}
	

	public static void main(String[] args) {
		
		fun obj = new fun();
		System.out.print(0);
		obj.fun1(6);
		
	}

}
