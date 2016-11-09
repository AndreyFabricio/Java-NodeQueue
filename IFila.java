package fila;

public interface IFila {
	
	public void limpar();
	
	public int tamanho();
	
	public boolean estaVazia();

	public boolean contem(int elemento);
	
	public int distancia(int elemento);
	
	public int remover();

	public void enfileirar(int elemento);
	
}//End of Interface IFila
