
import java.util.Scanner;

public class VectorRotacion {

    public int[] vector;
    public int n;

    public VectorRotacion(int n) {
        this.n = n;
        vector = new int[n];
    }

    public void ingresarValores() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
    }

public void rotar(int k) {
    for (int i = 0; i < k; i++) {
        int temp = vector[n - 1];
        for (int j = n - 1; j > 0; j--) {
            vector[j] = vector[j - 1];
        }
        vector[0] = temp;
    }
}


    public void imprimir() {
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

}
