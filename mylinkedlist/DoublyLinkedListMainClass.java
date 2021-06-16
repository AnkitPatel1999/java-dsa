package mylinkedlist;

public class DoublyLinkedListMainClass {

	public static void main(String[] args) {
		
		DoublyLinkedList dlist = new DoublyLinkedList();
		
		dlist.insertAtEnd(dlist,1);
		dlist.insertAtEnd(dlist,2);
		dlist.insertAtEnd(dlist,3);
		dlist.insertAtEnd(dlist,4);
		
		dlist.reverseDLL(dlist);
		
		//dlist.insertAtIndex(dlist, 44, 1);
		
//		dlist.insertAtHead(dlist,22);
//		dlist.insertAtHead(dlist,23);
//		dlist.insertAtEnd(dlist,24);
		
		dlist.printDLL(dlist);

	}

}
