package mylinkedlist;

public class MyLinkedList2<E> {
	
	 Node<E> head;
	 static class Node<E>
	{
		E data;
		Node<E> next;
		
		Node(E d)
		{
			data = d;
			next = null;
		}
		
	}
	
	E insert(E list ,E data)
	{
		
		Node newNode = new Node(data);
		Node current = head;
		
		
		if(current == null )
		{
			current = newNode;
			return list;
		}
		

		while(current.next != null)
		{
			current = current.next;

		}
		
		current.next = newNode;
		return list;
		
		
	}
	
	void print(E list)
	{
		Node temp = head;

		while(temp != null )
		{
			System.out.print( temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	

}
