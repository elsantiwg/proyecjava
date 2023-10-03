/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencia;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        
        double resultado = elevar(base, exponente);
        
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }

    public static double elevar(double base, int exponente) {
        if (exponente == 0) {
            return 1.0; // Cualquier número elevado a la potencia 0 es 1
        } else if (exponente > 0) {
            return base * elevar(base, exponente - 1); // Caso positivo: base * base^(exponente - 1)
        } else {
            // Caso negativo: 1 / (base * base^(-exponente - 1))
            return 1.0 / (base * elevar(base, -exponente - 1));
        }
    }
}


