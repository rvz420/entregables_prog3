package tp3ej1GDlista;

public class Simulacro {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();

		grafo.addVertice(0);
		grafo.addVertice(1);
		grafo.addVertice(2);
		grafo.addVertice(3);
		grafo.addVertice(4);
		
		grafo.insertarArista(0, 1);
		grafo.insertarArista(0, 2);
		grafo.insertarArista(1, 3);
		grafo.insertarArista(2, 3);
		grafo.insertarArista(3, 4);
		grafo.insertarArista(1, 0);
		
//		for (int i = 0; i < 1000; i++) {
//			grafo.addVertice(i);
//			grafo.addVertice(i+1);
//			grafo.insertarArista(i, i+1);
//		}
//		
		System.out.println(grafo.esCiclicoRecursivo());
		
//		grafo.esCiclicoIterable();
		
		
	}

}
