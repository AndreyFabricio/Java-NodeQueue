package fila;

public class Node {
	
   int elemento;
   Node prox;
   
    public Node() {
    	
    	this.prox = null;
      
    }
    
    public Node(int elemento) {
    	
    	this.elemento = elemento;
    	this.prox = null;
       
    }
    
    public Node(int elemento, Node prox) {
    	
        this.elemento = elemento;
        this.prox = prox;
    }
    
    public int getElemento() {
    	
        return elemento;
        
    }
    
    public Node getProx() {
    	
        return prox;
        
    }
    
    public void setElemento(int elemento) {
    	
        this.elemento = elemento;
        
    }
    
    public void setProx(Node prox) {
    	
        this.prox = prox;
        
    }
    
}//End of class Node
