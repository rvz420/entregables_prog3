package tp1ej3;

public class Pila {
	
	final static int INVALIDO = Integer.MIN_VALUE;
	ListaNodo elementos;
	
	public Pila (){
		elementos = new ListaNodo();
	}
	
	public int verTope(){
		if(!elementos.esVacia()){
			return elementos.getAt(0);
		}else{
			return INVALIDO;
		}
	}
	
	public void apilar(int elem){
		elementos.agregarElemInicio(elem);
	}
	
	public int desapilar(){
		int retorno = verTope();
		elementos.eliminarElemento(elementos.getCantElem());
		return retorno;
	}
	
	public boolean esVacia(){
		return elementos.esVacia();
	}

	@Override
	public String toString() {
		return "Pila [elementos=" + elementos + "]";
	}
	
	
	
}
