package collections;

import collections.BinarySearchTree.Node;

public class LinkedList implements ICollection {
	class Node {
		public int value;
		public Node next;
		public Node prev;

		public Node(int value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}
	}

	public Node head;

	@Override
	public void insert(int value) {
		head = insert(head, value);
	}

	@Override
	public void remove(int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public int findMaxValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	private Node insert(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		
		Node newNode = insert(current, value);
		
		newNode.prev = current;
		current.next = newNode;
		
		return current;
	}
}
