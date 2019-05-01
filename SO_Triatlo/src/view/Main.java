/*Objetivo:     Numa prova de triatlo moderno, o circuito se dá da seguinte maneira:
				- 3Km de corrida onde os atletas correm entre 20 e 25 m / 30 ms
				- 3 tiros ao alvo com pontuação de 0 a 10
				- 5 km de ciclismo onde os atletas pedalam entre 30 e 40 m/ 40 ms
				25 atletas participam da prova e largam juntos, no entanto, apenas 5 armas de tiro estão a
				disposição. Cada atleta leva de 0,5 a 3s por tiro. Conforme os atletas finalizam o circuito de
				corrida, em ordem de chegada, pegam a arma para fazer os disparos. Uma vez encerrados os
				disparos, a arma é liberada para o próximo, e o atleta segue para pegar a bicicleta e continuar
				o circuito.
				Para determinar o ranking final dos atletas, considera-se a seguinte regra:
				- O primeiro que chegar recebe 250 pontos, o segundo recebe 240, o terceiro recebe
				230, ... , o último recebe 10.
				- Soma-se à pontuação de cada atleta, o total de pontos obtidos nos 3 tiros (somados)
				Ordenar a pontuação e exibir o resultado final do maior pontuador para o menor.
                
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        30-04-2019
*/

package view;

import java.util.concurrent.Semaphore;

import controller.Triatlo;

public class Main {
	public static void main(String[] args) {
		Semaphore permissoes = new Semaphore(5);
		for (int id = 1; id < 26; id++) {
			Thread gincana = new Triatlo(id,permissoes);
			gincana.start();
		}
	}

}
