package fila;

import fila.IFila;
import fila.Node;

public class FilaEncadeada implements IFila{
	
	private Node inicio = null;
	private Node fim = null;
	private int qtdElementos = 0;

	@Override
	public void limpar() {		
		
		this.inicio = null;
		this.fim = null;
		this.qtdElementos = 0;
		System.out.println("A fila foi limpa");
		
	}//Fim do método limpar

	@Override
	public int tamanho() {
		
		if (inicio == null){
			
		System.out.println("A fila não possui nenhum elemento");
		
		}//Fim do if
		
		else{
			
			System.out.println("O tamanho da fila é: " +qtdElementos);
			
		}//Fim do else
		
		return this.qtdElementos;
		
	}//Fim do método tamanho

	@Override
	public boolean estaVazia() {
		
		if (inicio == null){
			
			System.out.println("A fila está vazia");
			return true;
			
		}//Fim do if
		
		System.out.println("A fila não está vazia");
		return false;
		
	}//Fim do método estaVazia

	@Override
	public boolean contem(int elemento) {
		
		Node aux = this.inicio;
		
		while (aux != null){
			
			if (aux.getElemento() == elemento){
				
				System.out.println("A fila contem o elemento " +elemento);
				return true;
				
			}//Fim do if
			
			aux = aux.getProx();
			
		}//Fim do while
		
		System.out.println("A fila não contem o elemento: " +elemento);
		return false;
		
	}//Fim do método contem

	@Override
	public int distancia(int elemento) {
		
		try{
		
		Node aux = this.inicio;
		
		if (aux.getProx().getElemento() == elemento){
			
			System.out.println("O elemento " +elemento+ " está 1 lugar distante na fila");
			return 1;
			
		}//Fim do if
		
		else{
		
			if (aux.getElemento() == elemento){
				
				System.out.println("O elemento " +elemento+ " é o primeiro da fila");
				return 0;
				
			}//Fim do if
			
		}//Fim do else
			
		aux = this.inicio;
		int cont;
		
		for (cont = 0; aux.getElemento() != elemento; cont++){
			
			aux = aux.getProx();
			
			}//Fim do for
		
		System.out.println("O elemento " +elemento+ " está " +cont+ " lugares distante na fila");
		return cont;
		
		}//Fim do try
		
		catch (NullPointerException cont){
			
			System.out.println("Elemento "+ elemento+ " não encontrado na fila");
			return elemento;
			
			}//Fim do catch
		
	}//Fim do método distancia

	@Override
	public int remover() {
		
		Node aux = this.inicio;
		
		if (aux == null){
			
			System.out.println("Fila Vazia");
			return -1;
			
		}//Fim do if
		
		else{
			
			this.inicio = this.inicio.getProx();
			this.qtdElementos--;
			System.out.println("O primeiro elemento foi removido da fila");
			
			if (qtdElementos == 0){
				
				this.fim = null;
				
			}//Fim do if
			
		}//Fim do else
		
		return -1;
		
	}//Fim do método remover

	@Override
	public void enfileirar(int elemento) {
		
		if (qtdElementos == 0){
			
			Node aux = new Node(elemento);
			this.inicio = aux;
			this.fim = aux;
			aux.setProx(null);
			qtdElementos++;
			System.out.println("O elemento " +elemento+ " foi adcionado a fila\n"
								+ "A fila agora possui " +qtdElementos+ " elemento(s)\n");
			
		}//Fim do if 
		
		else {
			
			Node aux = new Node (elemento);
			this.fim.setProx(aux);
			aux.setProx(null);
			this.fim = aux;
			this.qtdElementos++;
			System.out.println("O elemento " +elemento+ " foi adcionado a fila\n"
					+ "A fila agora possui " +qtdElementos+ " elemento(s)\n");
			
		}//Fim do else
		
	}//Fim do método enfileirar
	
}//Fim da classe FilaEncadeada
