package proyecto_eddi;

import java.util.ArrayList;

public class Arbol {

    ArrayList<Nodo> nodos = new ArrayList();

    public Arbol() {
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public void addNodo(Nodo nodo) {
        this.nodos.add(nodo);
    }
}
