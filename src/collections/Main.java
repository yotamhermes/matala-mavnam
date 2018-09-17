package collections;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		IPriorityQueue priorityTree = new PriorityQueueBST();
		
		check(priorityTree);
	}

	public static void check(IPriorityQueue queue) {
		Random rnd = new Random();

		for (int i = 0; i < 50; i++) {
			int num = rnd.nextInt(1000) + 1;

			queue.enqueue(num);
		}

		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
