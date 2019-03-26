/* Objetivo:    ... 

                Este codigo fonte sera salvo no arquivo Node.java

   Programador: Jonathan Willian Castro Pinheiro
   Data:        19:03:2019
*/

package controller;

public class Node {

	private String element; // O elemento do Node, pode ser de qualquer tipo
	private Node next; // A referencia do Node

	// construtor
	public Node(String e, Node n) {
		element = e;
		next = n;
	}

	// cria um node com referencia e elemento null
	public Node(String element) {
		this(element, null);
	}

	// retorna o elemento do node
	public String getElement() {
		return element;
	}

	// retorna a referencia para o proximo node
	public Node getNext() {
		return next;
	}

	// define o elemento deste node
	public void setElement(String newElem) {
		element = newElem;
	}

	// define a referencia para o proximo node
	public void setNext(Node newNext) {
		next = newNext;
	}
}
