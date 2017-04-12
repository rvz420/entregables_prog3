package tp3ej1GDlista;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Grafo {
	
	int tamanio;
	ArrayList<Nodo> vertices;
	
	public Grafo(){
		vertices=new ArrayList<Nodo>();
		tamanio = 0;
	}
	
	public void addVertice(int valor){
		vertices.add(new Nodo(valor));
	}
	
	public int cantVertices(){
		return vertices.size();
	}
	
	public int cantAristas(){
		int aristas = 0;
		for (Nodo  nodo : vertices) {
			aristas += nodo.getAdyacentes().size();
		}
		return aristas;
	}
	
	public Nodo buscarVertice(int valor){
		for (Nodo nodo : vertices) {
			if (valor == nodo.getValor()){
				return nodo;
			}
		}
		return null;
	}
	
	public boolean existeArista(int i, int j){
		try {
			return buscarVertice(i).getAdyacentes().contains(buscarVertice(j));
		} catch (Exception e) {
			return false;
		}
	}
	
	public double pesoArista(int i, int j){
		return buscarVertice(i).getAdyacente(j).getPeso();
	}
	
	public void insertarArista(int i, int j){
		Adyacente ady = new Adyacente (buscarVertice(j));
		buscarVertice(i).addAdyacente(ady);
	}
	
	public void insertarArista(int i, int j, double peso){
		Adyacente ady = new Adyacente (buscarVertice(j), peso);
		buscarVertice(i).addAdyacente(ady);
	}
	
	public ArrayList<Adyacente> adyacentesDe(int valor){
		return buscarVertice(valor).getAdyacentes();
	}
	
	public boolean esCiclicoRecursivo(){
		Hashtable<Integer, EstadoVisita> nodos = new Hashtable<Integer, EstadoVisita>();
		for (Nodo nodo : vertices)
			nodos.put(nodo.getValor(), EstadoVisita.NO_VISITADO);
		
		for (Nodo nodo : vertices)
			if ((nodos.get(nodo.getValor()) == EstadoVisita.NO_VISITADO))
				if (dfs_visit(nodo, nodos)){
					return true;
				}
		return false;
	}
	
	public boolean dfs_visit(Nodo nodo, Hashtable<Integer, EstadoVisita> nodos){
		//System.out.print(nodo.getValor());
		
		if (nodos.get(nodo.getValor()) == EstadoVisita.VISITANDO){
			return true;
		}
			
		nodos.put(nodo.getValor(), EstadoVisita.VISITANDO);
		
		for (Adyacente adyacente : nodo.getAdyacentes()){
			if( dfs_visit(adyacente.getDestino(), nodos)){
				return true;
			}
		}
		
		nodos.put(nodo.getValor(), EstadoVisita.VISITADO);
		return false;
	}
	
	
	public boolean esCiclicoIterable(){
		Hashtable<Integer, EstadoVisita> nodosVisita = new Hashtable<Integer, EstadoVisita>();
		Stack<Nodo> pila = new Stack<Nodo>();
		for (Nodo vertice : vertices) {
			nodosVisita.put(vertice.getValor(), EstadoVisita.NO_VISITADO);
		}
		pila.add(vertices.get(0));
		
		while (!pila.isEmpty()){
			Nodo nodoAux = pila.peek();
			//System.out.println(nodoAux.getValor());
			
			if(nodosVisita.get(nodoAux.getValor()) == EstadoVisita.NO_VISITADO){
				nodosVisita.put(nodoAux.getValor(), EstadoVisita.VISITANDO);
				if (vertices.size() > 0){
					for (int i = 0; i < nodoAux.getAdyacentes().size(); i++) {
						if( (nodosVisita.get(nodoAux.getAdyacenteAt(i).getDestino().getValor()) == (EstadoVisita.NO_VISITADO))){
							pila.add(nodoAux.getAdyacenteAt(i).getDestino());
						}else if ((nodosVisita.get(nodoAux.getAdyacenteAt(i).getDestino().getValor()) == (EstadoVisita.VISITANDO))){
							return true;
						}
					}
				}else{
					nodosVisita.put(nodoAux.getValor(), EstadoVisita.VISITADO);
					pila.pop();
				}
				
			}else if(nodosVisita.get(nodoAux.getValor()) == EstadoVisita.VISITADO){
				pila.pop();
			}else{
				nodosVisita.put(nodoAux.getValor(), EstadoVisita.VISITADO);
				pila.pop();
			}
		}
		return false;
	}
	
}