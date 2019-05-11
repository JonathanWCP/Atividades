/*Objetivo:    	Classe Exception para uso de metodos que podem interromper a execucao do programa.

                Este codigo fonte sera salvo no arquivo UnderflowException.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        15-04-2019
*/

package controller;

public class UnderflowException extends Exception {
	private static final long serialVersionUID = 1L;

		public String toString() {
			return "UNDERFLOW!";
		}

}
