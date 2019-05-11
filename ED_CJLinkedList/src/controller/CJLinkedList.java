/*Objetivo:    	Classe contendo metodos para adicionar, remover e alterar uma lista circular dupla. 

                Este codigo fonte sera salvo no arquivo CJLinkedList.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        15-04-2019
*/

package controller;

public class CJLinkedList {
	private Node head;
	private Node tail;
	private long size;

	public CJLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(Node novoNode) {
		novoNode.setNext(head);
		head = novoNode;
		size++;
		if (size == 1) {
			tail = head;
		} else {
			tail.setNext(head);
		}
	}

	public void insertLast(Node novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
		} else {
			novoNode.setNext(head);
			tail.setNext(novoNode);
			tail = novoNode;
			size++;
		}
	}
	
	public long getSize() {
		return size;
	}
	
	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			return head;
		}
	}
	
	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			return tail;
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
				head = head.getNext();
				tail.setNext(head);
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
				current.setNext(head);
				tail = current;
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
			for (int i = 0; i < getSize(); i++) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}
}
