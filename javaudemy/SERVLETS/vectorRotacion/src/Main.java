
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del vector: ");
        int n = sc.nextInt();
        VectorRotacion v = new VectorRotacion(n);
        v.ingresarValores();
        System.out.print("Ingrese el número de rotaciones: ");
        int k = sc.nextInt();
        v.rotar(k);
        v.imprimir();
    }
}
