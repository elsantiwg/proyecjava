/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificarorden;

import java.util.Scanner;

public class VerificarOrden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese elementos separados por espacios: ");
        String input = scanner.nextLine();
        String[] elementos = input.split(" ");

        // Verificar si la lista de palabras o números está ordenada
        boolean esOrdenCreciente = verificarOrden(elementos, true);
        boolean esOrdenDecreciente = verificarOrden(elementos, false);

        if (esOrdenCreciente && esOrdenDecreciente) {
            System.out.println("La lista está ordenada de forma creciente y decreciente.");
        } else if (esOrdenCreciente) {
            System.out.println("La lista está ordenada de forma creciente.");
        } else if (esOrdenDecreciente) {
            System.out.println("La lista está ordenada de forma decreciente.");
        } else {
            System.out.println("La lista no está ordenada de forma creciente ni decreciente.");
        }
    }

    public static boolean verificarOrden(String[] elementos, boolean creciente) {
        for (int i = 1; i < elementos.length; i++) {
            int comparacion = elementos[i - 1].compareTo(elementos[i]);
            if ((creciente && comparacion > 0) || (!creciente && comparacion < 0)) {
                return false;
            }
        }
        return true;
    }
}
