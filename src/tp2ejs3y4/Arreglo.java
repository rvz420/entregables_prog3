package tp2ejs3y4;

public class Arreglo {
	
	int[] elementos;
	int cantElem;
	
	public Arreglo(int tamaño){
		cantElem=0;
		elementos = new int[tamaño];
	}
	
	public void add (int i){
		elementos[cantElem] = i;
		cantElem++;
	}
	
	public int getCantElem(){
		return cantElem;
	}
	
	public void burbujeo(){
		int i, j, aux;

		for(i=0;i<elementos.length-1;i++)
			for(j=0;j<elementos.length-i-1;j++)
				if(elementos[j+1]<elementos[j]){
					aux=elementos[j+1];
					elementos[j+1]=elementos[j];
					elementos[j]=aux;
				}
	}
	
	public void mergeo(){
		new MergeSort(elementos);
	}

	@Override
	public String toString() {
		String retorno="";
		for (int i = 0; i < elementos.length; i++) {
			retorno += "["+elementos[i]+"]";
		}
		return retorno;
	}
	
	
	
}
