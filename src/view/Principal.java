/*
RESUMO      : Exercicio 03, fatorial com pilha
PROGRAMADORA: Luiza Felix
DATA        : 21/03/2023
 */

package view;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) throws HeadlessException, Exception {
		int numero = 0;
		Controller controller = new Controller();

		do {
			if(numero <0 || numero> 10){
				System.out.println("ERRO: Valor inválido!");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 10 para calcular o fatorial."));
		}while(numero <0 || numero> 10);

		JOptionPane.showMessageDialog(null, numero + "! = "+controller.fatorial(numero));
	}

}
