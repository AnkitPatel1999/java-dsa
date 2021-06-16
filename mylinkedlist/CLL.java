package mylinkedlist;

 class CLL {
	
	Node head,tail;
	
	 static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next=null;
		}
	}
	
	public CLL insertAtEnd(CLL list,int data)
	{
		Node current = list.head;
		Node newNode = new Node(data);
		
		if(list.head == null)
		{
			list.head = list.tail = newNode;
			return list;
		}
		
		tail.next =newNode;
		tail=newNode;
		tail.next=head;
		
		return list;
	}
	
	public CLL reverse(CLL list)
	{
		Node current=list.head;
		Node prev = null;
		Node nextNode=current.next;
		
		while(current != tail)
		{
			prev = current;
			current=nextNode;
			nextNode=current.next;
			current.next=prev;

		}	

		nextNode.next=tail;
		head=tail;	
		return list;
	}
	
	public void printCLL(CLL list)
	{
		Node temp = list.head;
		
		while(temp.next != tail)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data+" ");

		
	}
}
