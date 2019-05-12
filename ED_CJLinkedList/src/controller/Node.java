/*Objetivo:    	Classe com construtor do Node 

                Este codigo fonte sera salvo no arquivo Node.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        15-04-2019
*/

package controller;

public class Node {
	private String element;
	private Node next;
	
	public Node (String e, Node n) {
		element = e;
		next = n;
	}
	
	public Node (String element) {
		this(element, null);
	}
	
	public String getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(String newElement) {
		element = newElement;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}

}
