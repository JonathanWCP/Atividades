package view;

import controller.JDLinkedList;
import controller.Node;
import controller.UnderflowException;

public class Main {
	public static void main(String[] args) {
		JDLinkedList lista = new JDLinkedList();
		
		try {
			lista.insertFirst(new Node ("S"));
			lista.insertFirst(new Node ("D"));
			lista.insertFirst(new Node ("A"));
			lista.insertFirst(new Node ("S"));
			lista.insertLast(new Node ("J"));
			lista.removeFirst();
			lista.removeLast();
			lista.show();
		} catch (UnderflowException e) {
			System.out.println("ERRO! Impossivel remover! ");
		}
	}

}
