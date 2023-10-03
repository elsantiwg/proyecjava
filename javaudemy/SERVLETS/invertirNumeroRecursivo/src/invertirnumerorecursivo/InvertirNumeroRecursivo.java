/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirnumerorecursivo;

import java.util.Scanner;

public class InvertirNumeroRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        int numeroInvertido = invertirNumero(numero);
        
        System.out.println("El numero invertido es: " + numeroInvertido);
    }

    public static int invertirNumero(int numero) {
        if (numero < 10) {
            return numero; // Caso base: el número tiene un solo dígito, se devuelve tal cual
        } else {
            int ultimoDigito = numero % 10;
            int numeroSinUltimoDigito = numero / 10;
            int numeroInvertido = invertirNumero(numeroSinUltimoDigito);
            int longitud = (int) Math.log10(numeroInvertido) + 1; // Longitud del número invertido
            return (int) (ultimoDigito * Math.pow(10, longitud)) + numeroInvertido;
        }
    }
}
