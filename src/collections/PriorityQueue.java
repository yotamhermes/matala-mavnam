package collections;

public class PriorityQueue implements IPriorityQueue {
	private ICollection collection;

	public PriorityQueue(ICollection collection) {
		this.collection = collection;
	}

	@Override
	public void enqueue(int value) {
		collection.insert(value);
	}

	@Override
	public int dequeue() {
		int max = collection.findMaxValue();
		
		collection.remove(max);
		
		return max;
	}

	@Override
	public boolean isEmpty() {
		return collection.isEmpty();
	}
}
