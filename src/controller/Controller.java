/*
RESUMO      : Exercicio 03, fatorial com pilha
PROGRAMADORA: Luiza Felix
DATA        : 21/03/2023
 */

package controller;

import br.edu.fateczl.pilhas.IntPilha;

public class Controller {
	public long fatorial(int n) throws Exception {
		//jogo o problema não resolvido do pop para a variável de cima
		
		long fatorial = 1; //seria o equivalente a 0!
		IntPilha pilha = new IntPilha();
		
//		usando a ideia de pilha, primeiro carregarei minha pilha com a sequencia fatorial
		while (n != 0) {
			pilha.push(n);
			n--;
		}
		
//		depois de carregar a minha pilha com a sequencia numérica de fatorial, irei descarregar ela fazendo a multiplicação sucessiva de seus pop's
		while(!pilha.vazia()){
//			enquanto minha pilha não estiver vazia (for igual a null) eu não paro a multiplicação 
			fatorial*= pilha.pop();
		}
		
		return fatorial;
	}
	

}
