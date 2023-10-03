import java.util.Scanner;

public class Vector {
    public int n;

    public int[] arreglo;

    public Vector(int n){
        this.n = n;
        this.arreglo = new int[n];
    }

    public void cargarVector(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero " + (i + 1) + " :");
            arreglo[i] = sc.nextInt();
        }
    }

    public String imprimirVector(){
        String dato="";
        for (int i = 0; i < n; i++) {
            dato+=arreglo[i]+" ";
        }
        return dato; 
    }

    public void invertirVector(){
        int aux;

        for (int i = 0; i < n / 2; i++) {
            aux = arreglo[i];

            arreglo[i] = arreglo[n - i- 1];

            arreglo[n - i - 1] = aux;
        }
    }
}