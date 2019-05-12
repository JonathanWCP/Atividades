<<<<<<< HEAD
package controller;

public class JDLinkedList {
	private Node head;
	private Node tail;
	private long size;

	public JDLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}

	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}

	public long getSize() {
		if (isEmpty()) {
			return 0;
		} else {
			return size;
		}
	}

	public void insertFirst(Node novoNode) {
		if (isEmpty()) {
			head = novoNode;
			tail = novoNode;
			size++;
		} else {
			novoNode.setNext(head);
			head.setPrevious(novoNode);
			head = novoNode;
			size++;

		}
	}

	public void insertLast(Node novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
		} else {
			tail.setNext(novoNode);
			novoNode.setPrevious(tail);
			tail = novoNode;
			size++;
		}
	}

	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Node removedItem = head;
			if (head == tail) {
				head = tail = null;
			} else {
				head.getNext().setPrevious(null);
				head = head.getNext();
			}
			size--;
			return removedItem;
		}
	}

	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Node removedItem = tail;
			if (head == tail) {
				head = tail = null;
			} else {
				Node current = head;
				while (current.getNext() != tail) {
					current = current.getNext();
				}
				tail.getPrevious().setNext(null);
				tail = tail.getPrevious();
			}
			size--;
			return removedItem;
		}
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}

	public Node removeAfter(int pos) throws UnderflowException {
		int posList = 1;
		Node current = head;
		if (isEmpty()) {
			throw new UnderflowException();
		} else if (pos == posList) {
			System.out.println("A posicao nao pode ser do mesmo tamanho da lista!");
			return null;
		} else {
			while (posList != pos) {
				posList++;
				current = current.getNext();
			}
		}
			Node removedItem = current.getNext();
			if (removedItem == tail) {
				current.setNext(null);
			} else {
			removedItem.getNext().setPrevious(current);
			current.setNext(removedItem.getNext());
			}
			return removedItem;
	}
}
=======
package controller;

public class JDLinkedList {
	private Node head;
	private Node tail;
	private long size;

	public JDLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}

	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}

	public long getSize() {
		if (isEmpty()) {
			return 0;
		} else {
			return size;
		}
	}

	public void insertFirst(Node novoNode) {
		if (isEmpty()) {
			head = novoNode;
			tail = novoNode;
			size++;
		} else {
			novoNode.setNext(head);
			head.setPrevious(novoNode);
			head = novoNode;
			size++;

		}
	}

	public void insertLast(Node novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
		} else {
			tail.setNext(novoNode);
			novoNode.setPrevious(tail);
			tail = novoNode;
			size++;
		}
	}

	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Node removedItem = head;
			if (head == tail) {
				head = tail = null;
			} else {
				head.getNext().setPrevious(null);
				head = head.getNext();
			}
			size--;
			return removedItem;
		}
	}

	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Node removedItem = tail;
			if (head == tail) {
				head = tail = null;
			} else {
				Node current = head;
				while (current.getNext() != tail) {
					current = current.getNext();
				}
				tail.getPrevious().setNext(null);
				tail = tail.getPrevious();
			}
			size--;
			return removedItem;
		}
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}

	public Node removeAfter(int pos) throws UnderflowException {
		int posList = 1;
		Node current = head;
		if (isEmpty()) {
			throw new UnderflowException();
		} else if (pos == posList) {
			System.out.println("A posicao nao pode ser do mesmo tamanho da lista!");
			return null;
		} else {
			while (posList != pos) {
				posList++;
				current = current.getNext();
			}
		}
			Node removedItem = current.getNext();
			if (removedItem == tail) {
				current.setNext(null);
			} else {
			removedItem.getNext().setPrevious(current);
			current.setNext(removedItem.getNext());
			}
			return removedItem;
	}
}
>>>>>>> dc83a7aefd2cb7bc17f45a043c527f420e4e9d89
