package tst;

class Node {
	Node next;
	Node previous;
	int value;

	public Node(int value) {
		this.next = null;
		this.previous = null;
		this.value = value;
	}
}

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public int size() {
		return this.size;
	}

	public void addLast(int value) {
		if (this.isEmpty()) {
			Node newnode = new Node(value);
			this.tail = newnode;
			this.head = newnode;
		} else {
			Node newnode = new Node(value);
			this.tail.next = newnode;
			newnode.previous = this.tail;
			this.tail = newnode;
		}
		this.size++;

	}

	public void addFirst(int value) {
		if (this.isEmpty()) {
			Node newnode = new Node(value);
			this.head = newnode;
			this.tail = newnode;
		}

		else {
			Node newnode = new Node(value);
			this.head.previous = newnode;
			newnode.next = this.head;
			this.head = newnode;
		}
		this.size++;
	}

	public void addIndex(int value, int index) {
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException();
		}
		Node newnode = new Node(value);
		if (this.size == index) {
			addFirst(value);
		} else if (value == this.size - 1) {
			addLast(value);
		} else {
			Node aux = this.head;
			for (int i = 0; i < index - 1; i++) {
				aux = aux.next;
			}

			aux.next = newnode;
		}
	}

	public int getTamanho() {
		Node aux = this.head;
		int j = 0;
		while (aux != null) {
			aux = aux.next;
			j++;
		}
		return j;
	}

}
