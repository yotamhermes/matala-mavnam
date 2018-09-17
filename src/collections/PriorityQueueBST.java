package collections;

public class PriorityQueueBST implements IPriorityQueue {
	private BinarySearchTree tree;

	public PriorityQueueBST() {
		tree = new BinarySearchTree();
	}

	@Override
	public void enqueue(int value) {
		tree.insert(value);
	}

	@Override
	public int dequeue() {
		int max = tree.findMaxValue();
		
		tree.remove(max);
		
		return max;
	}

	@Override
	public boolean isEmpty() {
		return tree.isEmpty();
	}
}
