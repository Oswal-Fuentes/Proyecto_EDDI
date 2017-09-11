package TDAS;

import java.util.ArrayList;

public class Node {

    protected ArrayList<Node> nodes = new ArrayList();
    protected Node father;
    protected Object element;
    protected int frequency;
    protected boolean vacio;
    protected int level;
    protected boolean visitado;

    public Node(Object element, int frequency) {
        this.element = element;
        this.frequency = frequency;
        this.vacio = false;
    }

    public Node() {
        this.vacio = true;
    }

    public Node(Node L, Node R) {
        this.nodes.add(L);
        this.nodes.add(R);
        this.element = nodes.get(0).getFrequency()
                + nodes.get(1).getFrequency();
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public void setNodes(Node nodes) {
        this.nodes.add(nodes);
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public void Levels(int x){
        if(nodes.size()>0){
            this.level=x;
        }else{
            for (Node node : nodes) {
                node.Levels(x++);
            }
        }
    }

   
    

}
