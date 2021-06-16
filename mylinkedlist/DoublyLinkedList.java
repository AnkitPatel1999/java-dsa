package mylinkedlist;

public class DoublyLinkedList {
	
	Node head;
	
	public static class Node
	{
		int data;
		Node next,prev;
		
		Node( int data )
		{
			this.data = data;
			next=null;
			prev=null;
		}
	}
	
	public DoublyLinkedList insertAtEnd(DoublyLinkedList list, int data)
	{
		Node newNode =new Node(data);
		Node current = list.head;
		
		if(list.head == null)
		{
			newNode.prev =null;
			list.head =newNode;
			return list;
		}
		
		while(current.next != null )
		{
			current=current.next;
		}
		current.next=newNode;
		newNode.prev=current;
		
		
		
		return list;
	}
	
	public DoublyLinkedList insertAtHead(DoublyLinkedList list, int data)
	{
		Node newNode = new Node(data);
		Node current =list.head;
		
		newNode.next =current;
		newNode.prev=null;
		
		if(current != null)
		{
			head.prev = newNode;
		}
		head=newNode;
		return list;
	}
	
	public DoublyLinkedList insertAtIndex(DoublyLinkedList list, int data, int index)
	{
		Node newNode = new Node(data);
		Node current = list.head;
		int i=1;
		
		if(index==1)
		{
			head.prev = newNode;
			newNode.next = head;
			head=newNode;
			
			return list;
		}
				
		while(current != null && i < index-1)
		{
			current = current.next;
			i++;
		}
					
		newNode.next = current.next;
		current.next.prev =newNode;
		
		newNode.prev =current;
		current.next = newNode;
				
		return list;
	}
	
	public DoublyLinkedList reverseDLL(DoublyLinkedList list)
	{
		Node temp = null;
		Node current = list.head;
		
		while(current!= null)
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current = current.prev;
		}
		if(temp != null)
		{
			list.head = temp.prev;
		}
		return list;
	}
	
	
	
	public void printDLL(DoublyLinkedList list)
	{
		Node current = list.head;
		
		while(current != null)
		{
			System.out.println(current.data+" ");
			current =current.next;
		}
		
	}

}
