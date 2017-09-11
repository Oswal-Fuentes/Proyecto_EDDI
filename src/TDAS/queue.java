package TDAS;

import java.util.ArrayList;

public class queue {

    ArrayList<Node> cola;

    public queue() {
        cola=new ArrayList();
    }

    public queue(ArrayList<Node> cola) {
        this.cola = cola;
    }

    public void push(Node node) {
        this.cola.add(node);
    }

    public Node pop() {
        if (cola.size() > 0) {
            Node retVal= cola.get(0);
            cola.remove(0);
            return retVal;
        } else {
            return null;
        }
    }
    public int size(){
        return cola.size();
    }
    public void Sort() {
        for (int i = 0; i < cola.size(); i++) {
            for (int j = 0; j < cola.size() - 1; j++) {
                if (cola.get(j).getFrequency() > cola.get(j + 1).getFrequency()) {
                    Node temp = cola.get(j + 1);
                    cola.set(j + 1, cola.get(j));
                    cola.set(j, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
       String retVal="";
        for (Node node : cola) {
            retVal+=node.getElement().toString()+"\n";
        }
        return retVal;
    }
    
}
