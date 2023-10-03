
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System .in);

        System.out.println("Ingrese el tamaño del vector: ");

        int n = sc.nextInt();

        Vector v = new Vector(n);

        v.cargarVector();

        System.out.println("El vector original es: ");

        System.out.println(v.imprimirVector());

        v.invertirVector();

        System.out.println("El vector invertido es: ");

        System.out.println(v.imprimirVector());

        }
    }