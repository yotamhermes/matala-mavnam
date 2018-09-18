package collections;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ICollection linkedList = new LinkedList();
		IPriorityQueue priorityLL = new PriorityQueue(linkedList);
		
		check(priorityLL, "linked list");
		
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		
		ICollection tree = new BinarySearchTree();
		IPriorityQueue priorityBTS = new PriorityQueue(tree);
		
		check(priorityBTS, "tree");
	}

	public static void check(IPriorityQueue queue, String queueName) {
		Random rnd = new Random();
		
		System.out.println("filling - " + queueName);
		
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(1000) + 1;
			
			queue.enqueue(num);
			
			System.out.println(num + " inserted");
		}
		
		System.out.println("emptying - " + queueName);

		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue() + " removed");
		}
	}
}
