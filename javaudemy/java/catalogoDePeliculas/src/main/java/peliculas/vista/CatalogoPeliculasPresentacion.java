package peliculas.vista;

import java.util.Scanner;
import peliculas.servicio.CatalogoPeliculasImpl;
import peliculas.servicio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("elige unna opcion: \n "
                    + "1. iniciar catalogo de peliculas\n"
                    + "2.agregar pelicula\n"
                    + "3. listar pelicula\n"
                    + "4. buscar pelicula\n"
                    + "0. salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("introduzca el nombre de la pelicula");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("introduce una pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0: 
                    System.out.println("hasta pronto");
                    break;
                default:
                    System.out.println("opcion no reconocida");
                    break;
            }
        }
    }

}
