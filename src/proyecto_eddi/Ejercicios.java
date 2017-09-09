package proyecto_eddi;

import TDAS.B_Node;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        ArrayList<B_Node> nodes = new ArrayList();
        Table tb = new Table();
        tb.FindFrequency(ReadString());

        System.out.println("----Tabla----\n" + tb.toString());

        for (int i = 0; i < tb.size(); i++) {
            sym_f left_son = tb.Pop();
            sym_f right_son = tb.Pop();
            int f = (left_son.getFrecuencia() + right_son.getFrecuencia());
            nodes.add(new B_Node(new B_Node((Object) left_son.getCaracter(), left_son.getFrecuencia()),
                    new B_Node((Object) right_son.getCaracter(), right_son.getFrecuencia())));
        }
        System.out.println("------Arbol------");
        for (int i = 0; i < nodes.size(); i++) {
            System.out.println(nodes.get(i).toString());
        }

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
