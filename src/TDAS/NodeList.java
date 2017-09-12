/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAS;

import static java.util.Collections.list;

public class NodeList {
    protected Node[] nodes=new Node[2];
    protected int pos=0;
    public NodeList() {
    }
    
    public Node get(int x){
        return nodes[x];
    }
    
    public void add(Node x){
        nodes[pos]=x;
        pos++;
    }
    public void remove(int x){
        nodes[x]=new Node();
    }
    
    public Node[] getArray(){
        return nodes;
    }
}
