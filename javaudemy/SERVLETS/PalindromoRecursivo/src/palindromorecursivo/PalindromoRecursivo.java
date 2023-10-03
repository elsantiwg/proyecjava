/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromorecursivo;

import java.util.Scanner;

public class PalindromoRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String entrada = scanner.nextLine().toLowerCase(); // Convertir la entrada a minúsculas
        
        if (esPalindromo(entrada)) {
            System.out.println("La entrada es un palíndromo.");
        } else {
            System.out.println("La entrada no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String str) {
        // Caso base: una cadena vacía o de un solo carácter siempre es palíndromo
        if (str.length() <= 1) {
            return true;
        } else {
            char primerCaracter = str.charAt(0);
            char ultimoCaracter = str.charAt(str.length() - 1);

            // Si los caracteres en los extremos son iguales, verificar el subtexto interno
            if (primerCaracter == ultimoCaracter) {
                // Llamar recursivamente con el subtexto que excluye el primer y último carácter
                String subtexto = str.substring(1, str.length() - 1);
                return esPalindromo(subtexto);
            } else {
                return false; // Si los caracteres en los extremos son diferentes, no es palíndromo
            }
        }
    }
}
