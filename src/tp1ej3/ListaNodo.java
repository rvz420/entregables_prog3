package tp1ej3;

public class ListaNodo {

	private Nodo nodoPadre;
	private int cantElem;

	public ListaNodo(){
		this.nodoPadre = null;
		this.cantElem = 0;
	}
	
	public void agregarElem(int e){
		//agrega al final
		if(nodoPadre == null){
			nodoPadre = new Nodo(e);
		}else{
			Nodo nodoActual = nodoPadre;
			while(nodoActual.getSig() != null){
				nodoActual = nodoActual.getSig();
			}
			nodoActual.setSig(new Nodo(e));
		}
		this.cantElem++;
	}
	
	public void agregarElemInicio(int e){
		//agrega al final
		if(nodoPadre == null){
			nodoPadre = new Nodo(e);
		}else{
			Nodo nuevoNodo = new Nodo(e);
			nuevoNodo.setSig(nodoPadre);
			nodoPadre = nuevoNodo;
		}
		this.cantElem++;
	}

	public void eliminarElemento(int elem){
		if(nodoPadre != null){
			Nodo nodoActual = nodoPadre;
			Nodo nodoAnterior = null;

			if(nodoPadre.getElem() == elem){
				nodoPadre = nodoPadre.getSig(); //Eliminar si se encuentra en primer lugar
			}else{
				do{
					nodoAnterior = nodoActual;
					nodoActual = nodoActual.getSig();
					if(nodoActual.getElem() == (elem)){
						nodoAnterior.setSig(nodoActual.getSig());
					}
				}while(nodoActual.getSig() != null); //Eliminar si se encuentra en pos>1
			}
			this.cantElem--;
		}
	}

	public boolean esVacia(){
		return nodoPadre == null;
	}

	public int getAt(int pos){
		int retorno = -1;
		Nodo nodoActual = nodoPadre;
		if(pos<this.cantElem){
			for (int i = 0; i < pos; i++) {
				nodoActual = nodoActual.getSig();
			}
			retorno = nodoActual.getElem();
		}
		return retorno;
	}
	
//	public ListaNodo elementosComunes(ListaNodo otraLista){
//		ListaNodo aux = new ListaNodo();
//		
//		for (int i = 0; i < cantElem; i++) {
//			if ()
//		}
//	}
	
	public String toString() {
		String salida = "";
		if(nodoPadre != null){
			Nodo nodoActual = nodoPadre;
			do{
				salida += nodoActual.toString();
				nodoActual = nodoActual.getSig();
			}while(nodoActual.getSig() != null);

			salida += nodoActual.toString();
		}
		return salida;
	}

	public int getCantElem() {
		return cantElem;
	}
}
