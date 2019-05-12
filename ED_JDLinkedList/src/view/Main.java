package view;

import javax.swing.JOptionPane;

import controller.JDLinkedList;
import controller.Node;
import controller.UnderflowException;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		String j = "";
		JDLinkedList lista = new JDLinkedList();
		while (opc != 10) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- MENU PRINCIPAL -----"
					+ "\n1 - Adicionar item no inicio (head) " + "\n2 - Adicionar item no final (tail)"
					+ "\n3 - Remover item do inicio" + "\n4 - Remover item do final"
					+ "\n5 - Verificar tamanho da lista" + "\n6 - Verificar se lista esta vazia" + "\n7 - Exibir lista"
					+ "\n8 - Remover proximo node de uma posicao" + "\n9 - Sair"));
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
				int op = Integer
						.parseInt(JOptionPane.showInputDialog("Insira uma posicao, o proximo Node sera removido"));
				try {
					lista.removeAfter(op);
				} catch (UnderflowException e) {
					e.printStackTrace();
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
