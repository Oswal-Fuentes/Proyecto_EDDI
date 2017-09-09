package proyecto_eddi;

import java.util.Scanner;

public class Proyecto_EDDI {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicios x = new Ejercicios();
        boolean exit = false;
        while (exit == false) {
            switch (menu()) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                   x.textCompress();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Programa no Encontrado!");
                    break;
            }
        }
    }

    public static int menu() {
        System.out.println("-----------------MENU-------------------");
        System.out.print("1) Evaluacion por Desempeño\n"
                       + "2) Resolución de expresiones matemáticas\n"
                       + "3) Compresión de Archivos de texto\n"
                       + "4) Salir\n"
                       + "Ingrese Opcion:");
        int pos = sc.nextInt();
        return pos;
    }

    public static void print_tree() {

    }

}
