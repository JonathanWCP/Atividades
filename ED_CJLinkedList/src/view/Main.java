/*Objetivo:    	Implemente sobre a lista simples circular os seguintes metodos:
				isEmpty
				getFirst
				getLast
				insertFirst
				insertLast
				removeFirst
				removeLast
				show

                Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        15-04-2019
*/
package view;

import javax.swing.JOptionPane;

import controller.CJLinkedList;
import controller.Node;
import controller.UnderflowException;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		String j = "";
		CJLinkedList lista = new CJLinkedList();
		while (opc != 10) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- MENU PRINCIPAL -----" 
							+ "\n1 - Adicionar item no inicio (head) " 
							+ "\n2 - Adicionar item no final (tail)"
							+ "\n3 - Remover item do inicio" 
							+ "\n4 - Remover item do final"
							+ "\n5 - Verificar tamanho da lista" 
							+ "\n6 - Verificar se lista esta vazia"
							+ "\n7 - Exibir lista" 
							+ "\n8 - Coletar primeiro ou ultimo" 
							+ "\n9 - Sair"));
			switch (opc) {
			case 1:
				j = JOptionPane.showInputDialog("Digite o numero para adicionar no inicio da lista");
				lista.insertFirst(new Node(j));
				break;

			case 2:
				j = JOptionPane.showInputDialog("Digite o numero para adicionar no final da lista");
				lista.insertLast(new Node(j));
				break;

			case 3:
				try {
					lista.removeFirst();
					JOptionPane.showMessageDialog(null, "Primeiro item removido com sucesso!", "AVISO",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (UnderflowException e) {
					System.out.println("ERRO! Impossivel remover!");
				}
				break;

			case 4:
				try {
					lista.removeLast();
				} catch (UnderflowException e) {
					System.out.println("ERRO! Impossivel remover!");
				}
				JOptionPane.showMessageDialog(null, "Ultimo item removido com sucesso!", "AVISO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case 5:
				JOptionPane.showMessageDialog(null, "O tamanho da lista: " + lista.getSize());
				break;

			case 6:
				if (lista.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "A lista esta vazia!");
				} else {
					JOptionPane.showMessageDialog(null, "A lista nao esta vazia!");
				}
				break;

			case 7:
				lista.show();
				break;

			case 8:
				int op = Integer.parseInt(
						JOptionPane.showInputDialog("Deseja pegar o primeiro ou ultimo? (0 = primeiro/1 = ultimo"));
				if (op == 0) {
					try {
						System.out.println("Primeiro valor da lista: " + lista.getFirst().getElement().toString());
					} catch (UnderflowException e) {
						System.out.println("ERRO! Nao foi possivel coletar o primeiro valor da lista!");
					}
				} else {
					try {
						System.out.println("Ultimo valor da lista: " + lista.getLast().getElement().toString());
					} catch (UnderflowException e) {
						System.out.println("ERRO! Nao foi possivel coletar o ultimo valor da lista!");
					}
				}
				break;
				
			case 9:
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida! ");
			}

		}

	}

}
