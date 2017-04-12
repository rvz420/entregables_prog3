package tp3ej1GDlista;

public class Simulacro {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
			
		for (int i = 0; i < 1101; i++) {
			grafo.addVertice(i);
			grafo.addVertice(i+1);
			grafo.insertarArista(i, i+1);
		}
		
		//grafo.insertarArista(500, 227); //Sacar comentario para que haya un ciclo
		
		System.out.println("Iterable hay ciclo?:"+grafo.esCiclicoIterable());
		System.out.println("Iterable hay ciclo?:"+grafo.esCiclicoRecursivo());		
		
		
		/*
		 * ANALISIS
		 * 
		 * Un punto a destacar de la busqueda DFS es que en valores grandes, 
		 *se lanza un error de stack overflow
		 */
	}

}
