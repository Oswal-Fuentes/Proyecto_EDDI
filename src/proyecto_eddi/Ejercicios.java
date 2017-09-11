package proyecto_eddi;

import TDAS.B_Node;
import TDAS.Node;
import TDAS.Tree;
import TDAS.queue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto_eddi.CompresionTexto.Table;
import proyecto_eddi.CompresionTexto.sym_f;

public class Ejercicios {

    public Ejercicios() {
    }

    public void textCompress() {
        queue nodes=new queue();
        Table tb = new Table();
        tb.GenerateTable(ReadString());
        System.out.println("----Tabla----\n" + tb.toString());
        for (sym_f u : tb.getTable()) {
            nodes.push(new Node(u.getCaracter(),u.getFrecuencia()));
        }
        
        System.out.println(tb.size());
        System.out.println("------Arbol------");
        System.out.println(nodes.toString());
        Tree x= GenerateTree(nodes);
        System.out.println(x.toString());
        
    }
    public Tree GenerateTree(queue nodes){
        while(nodes.size()>1){
            nodes.Sort();
                       Node l=nodes.pop();
            Node r=nodes.pop();
            if(l==null){
                l=new Node();
            }
            if(r==null){
                r= new Node();
            }
            nodes.push(new Node(l,r));
            System.out.println("entro");
            nodes.Sort();
        }
        
        
        return new Tree(nodes.pop());
    }
    
    public String ReadString() {
        String retVal = "";
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);
            int seleccion = jfc.showOpenDialog(jfc);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;

                while ((linea = br.readLine()) != null) {
                    retVal += linea + "\n";
                }
            }
        } catch (Exception e) {
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {

            }

        }
        return retVal;
    }
}
