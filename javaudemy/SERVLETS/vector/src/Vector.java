import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Vector{
    private ArrayList<Integer> vector = new ArrayList<>();

    public void cargarVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del vector: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            vector.add(valor);
        }
    }

    public void imprimirVector() {
        System.out.println("Vector: " + vector);
    }

    public void reverseVector() {
        Collections.reverse(vector);
    }

    public void correr() {


        System.out.println("\nVector cargado:");
        imprimirVector();


        System.out.println("\nVector invertido:");
        imprimirVector();
    }

    public static void main(String[] args) {
        VectorM vectorManipulador = new VectorM();
        vectorManipulador.correr();
    }
}
