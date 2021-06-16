package myqueue;

public class MyQueue {
	
	Node head,rear;
	
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public MyQueue enQueue(MyQueue list, int data)
	{
		Node newNode = new Node(data);
		Node Qrear = list.rear;
		
		
		if(list.head == null )
		{
			list.head =list.rear= newNode;
			return list;
		}
		
		list.rear.next = newNode;
		list.rear = list.rear.next;
		
		return list;
		
	}
	
	public Object deQueue(MyQueue queue)
	{
		Node temp = queue.head;
		if(queue.head == null ){
			return null;
		}
		queue.head = queue.head.next;
		if(queue.head == null){
			queue.rear = null;
		}
		return temp.data;
	}
	
	public void printQueue(MyQueue queue)
	{

		Node temp = queue.head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
