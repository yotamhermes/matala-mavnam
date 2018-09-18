package collections;

public class LinkedList implements ICollection
{
	class Node
	{
		public int value;
		public Node next;
		public Node prev;

		public Node(int value)
		{
			this.value = value;
			this.next = null;
			this.prev = null;
		}
	}

	public Node head;

	@Override
	public void insert(int value)
	{
		Node newNode = new Node(value);

		if (head != null)
		{
			newNode.next = head;
			head.prev = newNode;
		}

		this.head = newNode;
	}

	@Override
	public void remove(int value)
	{
		Node current = head;

		while (current != null && current.value != value)
		{
			current = current.next;
		}

		if (current == null)
		{
			return;
		}

		if (current.prev != null)
		{
			current.prev.next = current.next;
		}
		else
		{
			head = current.next;
		}

		if (current.next != null)
		{
			current.next.prev = current.prev;
		}
	}

	@Override
	public int findMaxValue()
	{
		int max = head.value;
		Node current = head.next;

		while (current != null)
		{
			max = current.value > max ? current.value : max;
			
			current = current.next;
		}

		return max;
	}

	@Override
	public boolean isEmpty()
	{
		return head == null;
	}
}
