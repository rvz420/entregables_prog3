package tp1ej3;

public class Nodo {
	private int elem;
	private Nodo sig;

	public Nodo(int elem){
		this.elem = elem;
		this.sig = null;
	}

	public int getElem() {
		return elem;
	}

	public void setElem(int elem) {
		this.elem = elem;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	
	public String toString() {
		return "[" + this.elem + "]->";
	}



}
