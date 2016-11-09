package fila;

import fila.IFila;

public class teste{

	public static void main(String[] args) {
				
		int num = 5;
		IFila ifila = new FilaEncadeada();
		
		ifila.enfileirar(1);
		ifila.enfileirar(2);
		ifila.enfileirar(3);
		ifila.enfileirar(4);
		ifila.enfileirar(5);
		ifila.enfileirar(6);
		ifila.enfileirar(7);
		ifila.enfileirar(8);
		ifila.enfileirar(9);
		ifila.enfileirar(10);
		
		ifila.distancia(num);
		ifila.contem(num);		
		ifila.remover();
		ifila.distancia(num);
		ifila.contem(num);		
		ifila.estaVazia();		
		ifila.remover();
		ifila.tamanho();
		ifila.distancia(num);
		ifila.remover();
		ifila.tamanho();
		ifila.distancia(num);
		ifila.remover();
		ifila.tamanho();
		ifila.distancia(num);
		ifila.limpar();		
		ifila.estaVazia();
		
	}

}//Fim da classe teste
