package tp2ejs3y4;


public class MergeSort {
	private int[] arreglo;
	private int[] auxiliar;
	private int tamaño;
	
	public MergeSort(int[] numeros){
		arreglo = numeros;
		sort(arreglo);
	}
	
	public void sort(int[] valores){
		this.arreglo = valores;
		this.tamaño  = valores.length;
		this.auxiliar = new int[tamaño];
		mergeSort(0, tamaño-1);
	}
	
	private void mergeSort(int min, int max){
		if (min < max){
			int medio = (min + max)/2;
			
			mergeSort(min, medio);
			
			mergeSort(medio+1, max);
			
			merge(min, medio, max);
		}
	}
	
	private void merge(int min, int medio, int max){
		
		//redondea para abajo
		
		for (int i = min; i <= max; i++) {
			auxiliar[i] = arreglo[i];		
		}
		
		int i = min;		//index inicial del primer subArreglo
		int j = medio + 1;	//index inicial del segundo subArreglo
		int k = min;		//index inicial del subArreglo mergeado
		
		while((i <= medio) && (j <= max)){
			if(auxiliar[i] <= auxiliar [j]){
				arreglo[k] = auxiliar[i];
				i++;
			} else {
				arreglo[k] = auxiliar[j];
				j++;
			}
				k++;
		}
		while (i <= medio) {
			arreglo[k] = auxiliar[i];
			k++;
			i++;
		}
	}
	
}
