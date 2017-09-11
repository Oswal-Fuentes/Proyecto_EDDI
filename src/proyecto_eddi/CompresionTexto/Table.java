/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_eddi.CompresionTexto;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {

    protected ArrayList<sym_f> table = new ArrayList();
    

    public Table() {
    }

    public int size() {
        return table.size();
    }

    public sym_f Pop() {
        if (table.size() > 0) {
            sym_f rtval = table.get(0);
            table.remove(0);
            return rtval;
        } else {
            return null;
        }
    }
  
    public ArrayList<sym_f> getTable() {
        return table;
    }

    public void setTable(ArrayList<sym_f> table) {
        this.table = table;
    }

    public void GenerateTable(String u) {
        String x = u.toLowerCase();

        for (int i = 0; i < x.length() - 1; i++) {
            int f = 0;
            for (int j = i; j < x.length() - 1; j++) {
                if (x.charAt(i) == x.charAt(j) && this.Exist(x.charAt(i))) {
                    f++;
                }
            }
            if (f != 0) {
                table.add(new sym_f(x.charAt(i), f));
            }
        }
       
    }

    public void Sort() {
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.size() - 1; j++) {
                if (table.get(j).getFrecuencia() > table.get(j + 1).getFrecuencia()) {
                    sym_f temp = table.get(j + 1);
                    table.set(j + 1, table.get(j));
                    table.set(j, temp);
                }
            }
        }
    }

    public void CleanDuplicated() {
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).getFrecuencia() == 0) {
                table.remove(i);
            }
        }

    }

    public boolean Exist(char x) {
        for (int i = 0; i < table.size(); i++) {
            if (x == table.get(i).getCaracter()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String retVal = "Char\tFrequency\tCode\n";
        for (sym_f u : table) {
            retVal += u.toString();
        }
        return retVal;
    }

}
