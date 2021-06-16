package myqueue;

public class MainCircularClass {

	public static void main(String[] args) {
		CircularQueue<String> queue = new CircularQueue<>();
		
		queue.addToHead("ankit");
		queue.addToHead("patel");
		queue.addToHead("aj");
		


		
		queue.printCircularQueue();
		
	}

}
