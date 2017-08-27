package proyecto_eddi;

import java.util.ArrayList;

public class Nodo {

    int num;
    ArrayList<Nodo> nodos_hijos = new ArrayList();

    public Nodo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Nodo> getNodos_Hijos() {
        return nodos_hijos;
    }

    public void setNodos_Hijos(ArrayList<Nodo> nodos) {
        this.nodos_hijos = nodos;
    }

}
