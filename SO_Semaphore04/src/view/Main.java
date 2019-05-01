/*Objetivo:     ...
                
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        22-04-2019
*/

package view;

import java.util.concurrent.Semaphore;

import controller.Bank;

public class Main {
	public static void main(String[] args) {
		Semaphore[] permissoes = new Semaphore[2];
		
		for (int i = 0; i < 2; i++) {
			permissoes[i] = new Semaphore(1);
		}
		
		for (int id = 1; id <= 20; id++) {
			Thread banco = new Bank(id, (int)(Math.random()*2153)+1523, (int)(Math.random()*238)+512, permissoes);
			banco.start();
		}
	}
}
