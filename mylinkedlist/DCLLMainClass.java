package mylinkedlist;

public class DCLLMainClass {
	public static void main(String args[]) 
	{
		DCLL list = new DCLL();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);

//		list.insertAtHead(list, 10);
//		list.insertAtHead(list, 80);
//		list.insertAtHead(list, 20);
//		list.insertAtEnd(list, 30);
		
		list.deleteHead(list);
//		list.deleteHead(list);
//		list.deleteHead(list);
//		list.deleteHead(list);
		list.printDCLL(list);
		System.out.println();
		
//		list.deleteTail(list);
//		list.deleteTail(list);
//		

		
		
		list.printDCLL(list);
		
		
	}

}
