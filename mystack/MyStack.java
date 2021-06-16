package mystack;

public class MyStack
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	
	static MyStack push(MyStack stack,int data)
	{
		Node newNode = new Node(data);
		Node temp = stack.head;
		
		if(stack.head == null)
		{
			stack.head = newNode;
			return stack;
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		
		
		return stack;
	}


	static MyStack pop(MyStack stack)
	{
		Node temp = stack.head;
		
		if(temp.next == null)
		{
			stack.head = null;
			return stack;
		}
		
		while(temp.next.next != null )
		{
			temp = temp.next;
		}
		temp.next=null;		
		return stack;	
	}
	
	static void  printStack(MyStack stack)
	{
		Node temp = stack.head;
		
		while( temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	
	
	public static void main(String args[]) throws Exception
	{
		MyStack stack =  new MyStack();
		
		stack.push(stack, 5);
		stack.push(stack, 6);
		stack.push(stack, 7);
		
		printStack(stack);

		//stack.pop(stack);
		stack.pop(stack);
		
		System.out.println("After Operation ");
		printStack(stack);
		
		
	}
	
}