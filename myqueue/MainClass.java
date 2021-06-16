package myqueue;

public class MainClass<E>
{
	public static void main(String args[])
	{
		MyQueue queue = new MyQueue();
		
		queue.enQueue(queue, 11);
		queue.enQueue(queue, 12);
		queue.enQueue(queue, 13);
		queue.enQueue(queue, 14);
		
		System.out.println("deleted "+queue.deQueue(queue));
		System.out.println("deleted "+queue.deQueue(queue));

		System.out.println("deleted "+queue.deQueue(queue));
		queue.enQueue(queue, 15);
		System.out.println("deleted "+queue.deQueue(queue));
		System.out.println("deleted "+queue.deQueue(queue));
		System.out.println("deleted "+queue.deQueue(queue));
		queue.enQueue(queue, 15);

		queue.printQueue(queue);

	}
}