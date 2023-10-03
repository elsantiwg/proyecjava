import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class VectorManipulador {
    public ArrayList<Integer> vector = new ArrayList<>();

    public void cargar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del vector: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            vector.add(valor);
        }
    }

    public void imprimir() {
        System.out.println("Vector: " + vector);
    }

    public void invertir() {          
        Collections.reverse(vector);
    }
}