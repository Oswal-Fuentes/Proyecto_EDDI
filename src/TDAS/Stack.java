package TDAS;

import java.util.ArrayList;

public class Stack {

    protected ArrayList<Object> pila = new ArrayList();

    public Stack() {

    }

    public void push(Object x) {
        pila.add(x);

    }

    public Object pop() {
        Object x = pila.get(pila.size() - 1);
        pila.remove(pila.size() - 1);
        return x;
    }

    public void clear() {
        pila = new ArrayList();
    }

    public int size() {
        return pila.size();
    }

    public boolean empty() {
        if (pila.size() != 0) {
            return false;
        } else {
            return true;
        }
    }
}
