package TDAS;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

public class Node {

    protected NodeList nodes = new NodeList();
    protected Node father;
    protected Object element;
    protected int frequency;
    protected boolean vacio;
    protected boolean leaf;
    protected boolean visitado;

    public Node(Object element, int frequency) {
        this.element = element;
        this.frequency = frequency;
        this.vacio = false;
        this.leaf = true;
    }

    public Node() {
        this.vacio = true;
    }

    public Node(Node L, Node R) {
        this.nodes.add(L);
        this.nodes.add(R);
        this.element = nodes.get(0).getFrequency()
                + nodes.get(1).getFrequency();
        this.frequency = (int) element;
        this.leaf = false;
    }

    public boolean isVacio() {
        return vacio;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public NodeList getNodes() {
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

 

    @Override
    public String toString() {
        return element.toString();
    }

}
