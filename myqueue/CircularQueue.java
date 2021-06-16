package myqueue;

public class CircularQueue<E> {
	Node<E> head;
	
	static class Node<E>
	{
	  E data;
	  Node<E> next;
	  
	  public Node(E d)
	  {
		  this.data = d;
		  this.next = null;
	  }
	}
	
	public E addToHead(E data)
	{
		Node newNode = new Node(data);
		Node temp=head;
		
		if(head == null)
		{
			head = newNode;
			return head.data;
		}
		while(temp.next != null)
		{
			temp=temp.next;
		}
		
		temp.next = newNode;
		
		return data;	
	}
	
	public void printCircularQueue()
	{
		
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	

}
