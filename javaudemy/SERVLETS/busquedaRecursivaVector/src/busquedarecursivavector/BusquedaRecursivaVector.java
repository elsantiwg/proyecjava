package busquedarecursivavector;

import java.util.Scanner;

public class BusquedaRecursivaVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();
        
        int[] vector = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el número que desea buscar: ");
        int elementoBuscado = scanner.nextInt();
        
        int resultado = buscarElemento(vector, elementoBuscado, 0, n - 1);
        
        if (resultado != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posicion " + resultado);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el vector.");
        }
    }

    public static int buscarElemento(int[] vector, int elemento, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // El elemento no se encontró en el vector
        }

        int medio = (inicio + fin) / 2;

        if (vector[medio] == elemento) {
            return medio; // El elemento se encontró en la posición 'medio'
        } else if (vector[medio] < elemento) {
            return buscarElemento(vector, elemento, medio + 1, fin); // Buscar en la mitad derecha
        } else {
            return buscarElemento(vector, elemento, inicio, medio - 1); // Buscar en la mitad izquierda
        }
    }
}
