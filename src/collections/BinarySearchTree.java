package collections;

class Node {

	public int value;
	public Node left;
	public Node right;

	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int value) {
		this.root = this.insert(this.root, value);
	}
	
	public void remove(int value) {
		this.root = this.remove(this.root, value);
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public int findMaxValue() {
		return this.findMaxValue(this.root);
	}
	
	private Node insert(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value <= current.value) {
			current.left = insert(current.left, value);
		}
		else {
			current.right = insert(current.right, value);
		}

		return current;
	}
	
	private Node remove(Node current, int value) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (value == current.value) {
	        // Node to delete found
	    	
	    	// No children
	    	if (current.left == null && current.right == null) {
	    	    return null;
	    	}
	    	
	    	// Only left child
	    	if (current.right == null) {
	    	    return current.left;
	    	}
	    	 
	    	// Only right child
	    	if (current.left == null) {
	    	    return current.right;
	    	}
	    	
	    	// Two children
	    	
	    	int smallestValue = findMinValue(current.right);
	    	current.value = smallestValue;
	    	current.right = remove(current.right, smallestValue);
	    	return current;

	    } 
	    
	    if (value < current.value) {
	        current.left = remove(current.left, value);
	        return current;
	    }
	    
	    current.right = remove(current.right, value);
	    
	    return current;
	}
	
	private int findMinValue(Node root) {
	    return root.left == null ? root.value : findMinValue(root.left);
	}
	
	private int findMaxValue(Node root) {
	    return root.right == null ? root.value : findMaxValue(root.right);
	}
}
