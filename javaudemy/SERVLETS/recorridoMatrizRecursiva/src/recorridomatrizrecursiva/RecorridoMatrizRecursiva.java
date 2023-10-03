/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recorridomatrizrecursiva;

import java.util.Scanner;
import java.util.Random;

public class RecorridoMatrizRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        llenarMatrizAleatoriamente(matriz);

        System.out.println("Matriz:");
        imprimirMatriz(matriz, 0, 0);
    }

    public static void llenarMatrizAleatoriamente(int[][] matriz) {
        Random rand = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100); // Llena la matriz con números aleatorios entre 0 y 99
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz, int fila, int columna) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Caso base: si llegamos al final de la matriz, terminar la recursión
        if (fila == filas) {
            return;
        }

        // Imprimir el elemento en la posición actual
        System.out.print(matriz[fila][columna] + " ");

        // Moverse a la siguiente columna o a la siguiente fila cuando alcanzamos el final de una fila
        if (columna == columnas - 1) {
            System.out.println(); // Cambio de línea
            imprimirMatriz(matriz, fila + 1, 0); // Siguiente fila, primera columna
        } else {
            imprimirMatriz(matriz, fila, columna + 1); // Misma fila, siguiente columna
        }
    }
}
