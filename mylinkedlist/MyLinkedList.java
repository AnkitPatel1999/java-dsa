package mylinkedlist;
import java.io.*; 

public class MyLinkedList {

	public Node head;
	
	public static class Node {
		
		public int data;
		public Node next;
		
		public Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public MyLinkedList insert(MyLinkedList list, int data)
	{
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null)
		{
			list.head = new_node;
		}else {
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		
		return list;
	}
	
	public static MyLinkedList insertAtTail(MyLinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next=null;
	
		Node currNode = list.head;
		
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next= newNode;
		return list;
	}
		
	public static MyLinkedList insertAtHead(MyLinkedList list, int data)
	{
		Node newNode = new Node(data);
		Node temp = list.head;
		
		//list.head =newNode;
		newNode.next = list.head; 
		list.head=newNode;
		return list;
	}
	
	public static MyLinkedList deleteAt(MyLinkedList list, int key)
	{
		Node currNode = list.head;
		
		if(key == 0)
		{
			
			list.head =currNode.next;
			//System.out.print(currNode.data);
			return list;
		}else
		{
		
		for(int i=0;i<key-1;i++)
		{
			currNode = currNode.next;
		}
		currNode.next = currNode.next.next;
		
		return list;
		}
	}
	
	public static MyLinkedList insertAtIndex(MyLinkedList list, int index, int data)
	{
		Node newNode = new Node(data);
		Node temp = list.head;
		
		if(temp == null)
		{
			list.head = newNode;
			return list;
		}
		
		if(index == 0)
		{
			newNode.next = list.head;
			list.head = newNode;
			return list;
		}
		
		
		for(int i=0; i<index-1; i++)
		{
			temp = temp.next;
		}

		
		newNode.next = temp.next;
		temp.next= newNode;
		

		return list;
	}
	
	public static MyLinkedList reverseLinkedList(MyLinkedList list)
	{
		Node current =list.head;
		Node nextNode = null;
		Node previous =null;
		
		while(current != null)
		{
			nextNode = current.next;
			current.next =previous;
			previous = current;
			current = nextNode;
		}
		list.head=previous;
	
		return list;
	}
		
	public void printList(MyLinkedList list)
	{
		Node currNode = list.head;
		
		System.out.println("linked list  ");
		
		while(currNode != null)
		{
			System.out.print(currNode.data + " ");
			currNode = currNode.next;

		}
		
	}

	public MyLinkedList insertSort(MyLinkedList list, int data)
	{
		Node newNode = new Node(data);
		Node current = list.head;
		Node temp = list.head;
		
		while( current != null && current.data < newNode.data )
		{
			temp = current;
			current =current.next;
		}
		
		 newNode.next = temp.next;
		 temp.next = newNode;
		  
		return list;
	}

	public MyLinkedList removeDuplicate(MyLinkedList list)
	{
		Node current = list.head;
		
		while( current != null )
		{
			if(current.next != null && current.data == current.next.data)
			{
				current.next = current.next.next;				
			} else {
				current = current.next;
			}
		}	
		return list;
	}

	public Node findFromEnd(MyLinkedList list, int index)
	{
		Node current = list.head;
		Node temp = list.head;
		int count = 0;
		
		while(count < index)
		{
			temp = temp.next;
			count++;
		}
		
		while(temp != null )
		{
			temp = temp.next;
			current= current.next;
		}		
		return current;
	}

	public void compare(MyLinkedList list1,MyLinkedList list2)
	{
		boolean flag = true;
		
		Node l1 = list1.head;
		Node l2 = list2.head;
		
		int count1=1;
		int count2=1;
		
		while( l1.next != null )
		{
			l1=l1.next;
			count1++;	 
		}
		while( l2.next != null )
		{
			l2=l2.next;
			count2++;	
		}
		if(count1 != count2)
		{
			flag =false;

		}else {
			
			Node temp1 = list1.head;
			Node temp2 = list2.head;
			
			while(temp1 != null)
			{
				if(temp1.data != temp2.data)
				{
					flag=false;
				}
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		if(flag== true)
		{
			System.out.println("equeal ");			
		}else {
			System.out.println("llnot equeal");
		}
				
	}
	
	public MyLinkedList merge(MyLinkedList list1, MyLinkedList list2)
	{
		Node l1 = list1.head;
		Node l2 = list2.head;
		Node add = null;
		
		while(l1.next != null )
		{
			l1=l1.next;
		}
		l1.next=l2;
		
		Node temp=list1.head;
		Node index=null;
		Node x=new Node(0);
		
		while(temp != null)
		{
			index=temp.next;
			while(index != null )
			{
				if(temp.data > index.data)
				{
					x.data = temp.data;
					temp.data = index.data;
					index.data = x.data;
					
				}
				index= index.next;
			}
			temp=temp.next;
			
		}
		
		
	
		return list1;
	}
	
	public MyLinkedList sort(MyLinkedList list)
	{
		Node current = list.head;
		Node index = null;
		Node temp=new Node(0);
		
		while(current != null)
		{
			index = current.next;
			while(index != null)
			{
				if(current.data > index.data)
				{
					temp.data=current.data;
					current.data=index.data;
					index.data=temp.data;
				}
				
				index =index.next;
			}
			current=current.next;
		}
		return list;
	}

	
}
