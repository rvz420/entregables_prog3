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
		System.out.print(nodo.getValor());
		nodos.put(nodo.getValor(), EstadoVisita.VISITANDO);
		
		for (Adyacente adyacente : nodo.getAdyacentes()){
			if (nodos.get(adyacente.getDestino().getValor()) == EstadoVisita.NO_VISITADO){
				if( dfs_visit(adyacente.getDestino(), nodos)){
					return true;
				}
			}else if(nodos.get(adyacente.getDestino().getValor()) == EstadoVisita.VISITANDO){
				System.out.println("VISITANDO");
				return true;
			}
		}
		nodos.put(nodo.getValor(), EstadoVisita.VISITADO);
		return false;
	}
	
	
	public void esCiclicoIterable(){
		Hashtable<Integer, EstadoVisita> nodosVisita = new Hashtable<Integer, EstadoVisita>();
		Stack<Nodo> pila = new Stack<Nodo>();
		for (Nodo vertice : vertices) {
			nodosVisita.put(vertice.getValor(), EstadoVisita.NO_VISITADO);
			pila.add(vertice);
		}
		
		while (!pila.isEmpty()){
			Nodo nodoAux = pila.pop();
			if(nodosVisita.get(nodoAux.getValor()) == EstadoVisita.NO_VISITADO){
				nodosVisita.put(nodoAux.getValor(), EstadoVisita.VISITANDO);
				for (int i = 0; i < nodoAux.getAdyacentes().size(); i++) {
					pila.add(nodoAux.getAdyacenteAt(i).getDestino());
				}
				nodosVisita.put(nodoAux.getValor(), EstadoVisita.VISITANDO);
			}else if (nodosVisita.get(nodoAux.getValor()) == EstadoVisita.VISITANDO){
				System.out.println(nodoAux.getValor());
				System.out.println("CICLO");
			}
		}
				
	}
	
}