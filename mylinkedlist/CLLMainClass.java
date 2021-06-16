package mylinkedlist;

public class CLLMainClass {

	public static void main(String[] args) {

		CLL list = new CLL();
		
		
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);

		//list.printCLL(list);

		list.reverse(list);
		list.printCLL(list);
		
	}

}
