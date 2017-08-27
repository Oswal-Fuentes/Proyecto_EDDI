package proyecto_eddi;

import java.util.Scanner;

public class Proyecto_EDDI {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        boolean exit = false;
        while (exit == false) {
            switch (menu()) {
                case 1:
                   
                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese opcion dentro del rango");
                    break;
            }
        }
    }

    public static int menu() {
        System.out.println("---MENU---");
        System.out.print("1) Agregar\n"
                + "2) Limpiar\n"
                + "3) Imprimir\n"
                + "4) Salir\n");
        int pos = sc.nextInt();
        return pos;
    }

    public static void print_tree(){
        
    }

}
