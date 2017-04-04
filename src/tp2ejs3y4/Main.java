package tp2ejs3y4;


public class Main {

	public static void main(String[] args) {
		
		long startTime;
		long totalTime;
		
		//CREAMOS ARREGLOS PARA ORDENARLOS UNOS CON BURBUJEO Y OTROS CON MERGESORT
		//Arreglos burbujeo:
		
		Arreglo arrB5    = new Arreglo(5);
		Arreglo arrB10   = new Arreglo(10);
		Arreglo arrB50   = new Arreglo(50);
		Arreglo arrB100  = new Arreglo(100);
		Arreglo arrB500  = new Arreglo(500);
		Arreglo arrB1000 = new Arreglo(1000);
		Arreglo arrB50000 = new Arreglo(50000);
		
		//Arreglos mergeSort:
		Arreglo arrM5    = new Arreglo(5);
		Arreglo arrM10   = new Arreglo(10);
		Arreglo arrM50   = new Arreglo(50);
		Arreglo arrM100  = new Arreglo(100);
		Arreglo arrM500  = new Arreglo(500);
		Arreglo arrM1000 = new Arreglo(1000);
		Arreglo arrM50000 = new Arreglo(50000);

		
		
		//Carga de arreglos
		for (int i = 0; i < 5; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB5.add(elementoRandom);
			arrM5.add(elementoRandom);
		}
		
		for (int i = 0; i < 10; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB10.add(elementoRandom);
			arrM10.add(elementoRandom);
		}
		
		for (int i = 0; i < 50; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB50.add(elementoRandom);
			arrM50.add(elementoRandom);
		}
		
		for (int i = 0; i < 100; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB100.add(elementoRandom);
			arrM100.add(elementoRandom);
		}
		
		for (int i = 0; i < 500; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB500.add(elementoRandom);
			arrM500.add(elementoRandom);
		}
		
		for (int i = 0; i < 1000; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB1000.add(elementoRandom);
			arrM1000.add(elementoRandom);
		}
		
		for (int i = 0; i < 50000; i++) {
			int elementoRandom = (int)Math.floor(Math.random()*(100-1+1)+1); 
			arrB50000.add(elementoRandom);
			arrM50000.add(elementoRandom);
		}
		
		
		//TIEMPOS
		//Arreglo 5 burbuja
		startTime = System.currentTimeMillis();
		arrB5.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[5]: "+totalTime);
		
		//Arreglo 5 mergeSort
		startTime = System.currentTimeMillis();
		arrM5.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[5]: "+totalTime);
		
		System.out.println();
		
		//Arreglo 10 burbuja
		startTime = System.currentTimeMillis();
		arrB10.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[10]: "+totalTime);
		
		//Arreglo 10 mergeSort
		startTime = System.currentTimeMillis();
		arrM10.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[10]: "+totalTime);
		
		System.out.println();
		
		//Arreglo 50 burbuja
		startTime = System.currentTimeMillis();
		arrB50.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[50]: "+totalTime);
		
		//Arreglo 50 mergeSort
		startTime = System.currentTimeMillis();
		arrM50.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[50]: "+totalTime);
		
		System.out.println();
		
		//Arreglo 100 burbuja
		startTime = System.currentTimeMillis();
		arrB100.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[100]: "+totalTime);
		
		//Arreglo 100 mergeSort
		startTime = System.currentTimeMillis();
		arrM100.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[100]: "+totalTime);
		
		System.out.println();
		
		//Arreglo 500 burbuja
		startTime = System.currentTimeMillis();
		arrB500.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[500]: "+totalTime);
		
		//Arreglo 500 mergeSort
		startTime = System.currentTimeMillis();
		arrM500.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[500]: "+totalTime);
		
		System.out.println();
		
		//Arreglo 1000 burbuja
		startTime = System.currentTimeMillis();
		arrB1000.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[1000]: "+totalTime);
		
		//Arreglo 1000 mergeSort
		startTime = System.currentTimeMillis();
		arrM1000.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[1000]: "+totalTime);
		
		System.out.println();
		
		//Arreglo 50000 burbuja
		startTime = System.currentTimeMillis();
		arrB50000.burbujeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo Burbujeo  arreglo[50000]: "+totalTime);
		
		//Arreglo 50000 mergeSort
		startTime = System.currentTimeMillis();
		arrM50000.mergeo();
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Tiempo MergeSort arreglo[50000]: "+totalTime);
		
		System.out.println();
		
		
	}

}
