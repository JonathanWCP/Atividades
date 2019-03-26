/* Objetivo:    ... 

                Este codigo fonte sera salvo no arquivo JLinkedList.java

   Programador: Jonathan Willian Castro Pinheiro
   Data:        19:03:2019
*/

package controller;
public class JLinkedList {
	protected Node head; 		//node cabeca da lista
	protected Node tail;		//node cauda da lista
	protected long size;		//numero de nodes na lista
	
	//construtor padrao que cria uma lista vazia (null)
	public JLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	//verifica se a lista esta vazia
	public boolean isEmpty() {
		return head == null;
	}
	
	//retorna o primeiro elemento da lista sem remove-lo
	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}
	
	//retorna o ultimo elemento da lista sem remove-lo
	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}
	
	//inserir elementos na lista
	
	//inserir no comeco da lista
	public void insertFirst(Node novoNode) {
		novoNode.setNext(head); 
		head = novoNode;
		size++;
		if (size == 1) {
			tail = head;
		}
	}
	
	//inserir no fim da lista
	public void insertLast(Node novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
		} else {
			novoNode.setNext(null);
			tail.setNext(novoNode);
			tail = novoNode;
			size++;
		}
	}
	
	//remover elementos da lista
	
	//remover o primeiro elemento da lista
	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getNext();
		}
		size--;
		return removedItem;
			
	}
	
	//remover o ultimo elemento da lista
	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			Node current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			tail = current;
			current.setNext(null);
		}
		size --;
		return removedItem;
		}
	
	
	//exibe a lista
	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!"); 
		} else {
			System.out.print("A lista é: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}
}
