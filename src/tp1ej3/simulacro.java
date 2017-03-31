package tp1ej3;

public class simulacro {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
		
		System.out.println("pila vacia? = "+pila.esVacia());
		pila.desapilar();
		pila.apilar(1);
		System.out.println("pila vacia? = "+pila.esVacia());
		System.out.println("tope = "+pila.verTope());
		pila.apilar(2);
		pila.apilar(3);
		System.out.println("tope = "+pila.verTope());
		System.out.println("desapilando = "+pila.desapilar()); 
		
	}

}
