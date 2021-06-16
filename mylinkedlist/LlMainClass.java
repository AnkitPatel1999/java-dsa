package mylinkedlist;

import mylinkedlist.MyLinkedList.Node;

public class LlMainClass {


	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();			
			list.insert(list, 1);
			list.insert(list, 2);
			list.insert(list, 3);
			list.insert(list, 4);

			
//		MyLinkedList list2 = new MyLinkedList();			
//
//
//			list2.insert(list2, 3);
//			list2.insert(list2, 5);
//			list2.insert(list2, 7);

			list.printList(list);
			//System.out.println();
			//list.printList(list2);
			System.out.println("\n after");
			
			
			//list.sort(list);
			
			//list.merge(list, list2);
			//list.compare(list , list2);
		
//			list.insert(list, 12);

			
//			list.insertSort(list,1 );
//			list.insertSort(list,10 );
						
			//System.out.println("found = " + list.findFromEnd(list, 3).data);
			//list.removeDuplicate(list);

			
			list.reverseLinkedList(list);
			
//			list.insertAtTail(list, 5);
//			list.insertAtTail(list, 6);
//			
//			list.insertAtHead(list, 7);
//			list.insertAtHead(list, 8);
			//list.insertAtHead(list, 9);
//		
//			list.deleteAt(list, 4);

//			list.insertAtIndex(list,4,99);
		
		
			list.printList(list);
			//System.out.println();
			//list.printList(list2);

	}

	


}
