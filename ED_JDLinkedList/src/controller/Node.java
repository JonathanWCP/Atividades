package controller;

public class Node {
	private String element;
	private Node next;
	private Node previous;
	
	public Node (String e, Node n) {
		this.element = e;
		this.next = n;
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
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setElement (String newElement) {
		element = newElement;
	}
	
	public void setNext (Node newNext) {
		next = newNext;
	}
	
	public void setPrevious (Node newPrevious) {
		previous = newPrevious;
	}

}
