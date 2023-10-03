import java.util.Scanner;

public class SumaNaturalesRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hasta que valor desea sumar?");
        int n = scanner.nextInt();
        System.out.print("desde que valor desea sumar?");
        int m = scanner.nextInt();
        
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        int resultado = sumarNaturales(n, m);
        System.out.println("La suma de los numeros naturales desde " + n + " hasta " + m + " es: " + resultado);
    }

    public static int sumarNaturales(int n, int m) {
        if (n == m) {
            return n;
        } else {
            return n + sumarNaturales(n + 1, m);
        }
    }
}

