package mylinkedlist;

public class DCLL {

	Node head,tail;
	
	public static class Node
	{
		int data;
		Node next,prev;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public DCLL insertAtEnd(DCLL list, int data)
	{
		Node newNode = new Node(data);
		Node current = list.head;
		
		if(list.head == null)
		{
			list.head= list.tail = newNode;	
			newNode.next=head;
			newNode.prev=tail;
			return list;
		}
		
		newNode.prev = tail;
		tail.next = newNode;
		newNode.next = head;
		head.prev = newNode;
		tail = newNode;	
		
		return list;
	}
	
	public DCLL insertAtHead(DCLL list, int data)
	{
		Node newNode = new Node(data);
		Node current = list.head;
		
		if(list.head == null)
		{
			list.head= list.tail = newNode;	
			newNode.next=head;
			newNode.prev=tail;
			return list;
		}
		
		newNode.prev = tail;
		tail.next = newNode;
		newNode.next = head;
		head.prev = newNode;
		head = newNode;	
		
		return list;
	}
	
	public DCLL deleteHead(DCLL list)
	{
		
		if(list.head == null)
		{
			return null;
		}
		if(head == tail)
		{
			head=null;
			tail=null;
			return null;
		}
	
//		list.head=list.head.next;
//		list.head.prev =tail;
//		tail.next = list.head;
		list.head=list.head.next;

		return list;
	}
	
	public DCLL deleteTail(DCLL list)
	{
		Node current = list.head;
		Node temp =list.head;
		
		if(list.head == null)
		{
			return null;
		}
		if(head == tail)
		{
			head=null;
			tail=null;
			return null;
		}
		
		while(current != tail )
		{
			temp=current;
			current = current.next;
		}

		list.tail=temp;
		return list;
	}
	
	
	
	public void printDCLL(DCLL list) 
	{
		Node current = list.head;
		if(list.head == null)
		{
			System.out.println("List empty ");
		}else {
		
		while(current != tail)
		{
			System.out.print(current.data +" ");
			current = current.next;
		}
		System.out.print(current.data +" ");
		}
	}

}
