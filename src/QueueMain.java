
public class QueueMain {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Initial Queue: " + queue);
        int frontElement = queue.dequeue();
        System.out.println("Dequeued Element: " + frontElement);
        System.out.println("Queue after dequeue: " + queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Is Queue Empty? " + queue.isEmpty());

	}

}
