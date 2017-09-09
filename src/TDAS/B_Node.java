package TDAS;

import proyecto_eddi.CompresionTexto.sym_f;

public class B_Node {

    protected Object element;
    protected B_Node Father;
    protected B_Node left_child;
    protected B_Node right_child;
    protected int frequency;

    public B_Node(Object element) {
        this.element = element;

        this.left_child = null;
        this.right_child = null;
    }

    public B_Node(B_Node left_child, B_Node right_child) {
        this.left_child = left_child;
        this.right_child = right_child;
        this.element = left_child.getFrequency() + right_child.getFrequency();
        this.frequency = frequency;
    }

    public B_Node(Object element, int frequency) {
        this.element = element;
        this.frequency = frequency;
        this.left_child = null;
        this.right_child = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public B_Node getLeft_child() {
        return left_child;
    }

    public void setLeft_child(B_Node left_child) {
        this.left_child = left_child;
    }

    public B_Node getRight_child() {
        return right_child;
    }

    public void setRight_child(B_Node right_child) {
        this.right_child = right_child;
    }

    public B_Node getFather() {
        return Father;
    }

    public void setFather(B_Node Father) {
        this.Father = Father;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        String retval = "";
        if (left_child == null || right_child == null) {
            retval = this.element.toString() + "\n";
        } else {
            retval = this.element.toString() + "\n";
            retval += "\t" + left_child.getElement().toString() + "\n"
                    + "\t" + right_child.getElement().toString() + "\n";
        }
        return retval;
    }

}
