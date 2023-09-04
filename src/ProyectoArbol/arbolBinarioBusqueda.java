package ProyectoArbol;

public class arbolBinarioBusqueda {
	Nodo raiz;
	
	public arbolBinarioBusqueda() {
		raiz = null;
	}
	
	public boolean esVacio() {
		return raiz == null;
	}
	
	public void insertar(int clave) {
		Nodo N = new Nodo(clave);
		if(esVacio()) {
			raiz = N;
			
		}else {
			Nodo aux = raiz;
			while(aux != null) {
				N.padre= aux;
				if(N.valor >= aux.valor) {
					aux = aux.nodoDer;
				}else {
					aux = aux.nodoIzq;
				}
			}
			if(N.valor < N.padre.valor) {
				N.padre.nodoIzq = N;
			}else {
				N.padre.nodoDer = N;
			}
		}
	}
	
	public Nodo buscar(int Dato, Nodo N) {
		if (N == null) {
			return null;
		}
		if (N.valor == Dato) {
			return N;
		} else if (Dato > N.valor) {
			return buscar(Dato, N.nodoDer);
		} else {
			return buscar(Dato, N.nodoIzq);
		}
	}
		

	
	
	
	public void imprimir(Nodo N) {
		if(N != null) {
			System.out.println("Nodo: " + N.valor);
			imprimir(N.nodoIzq);
			imprimir(N.nodoDer);
			
			
		}
	}
	
	public static void main(String Args[]) {
		arbolBinarioBusqueda a = new arbolBinarioBusqueda();
		System.out.println("¿El arbol está vacio antes de insertarle datos?: "+a.esVacio());
		
		a.insertar(1);
		a.insertar(2);
		a.insertar(3);
		a.insertar(4);
		
		a.imprimir(a.raiz);
		Nodo b = a.buscar(2, a.raiz);
		System.out.print("Se encontró el nodo " + b.valor);
	}
	

}











