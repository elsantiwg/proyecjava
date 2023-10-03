
public class LlamarVector {

    public static void main(String[] args) {
        
        VectorManipulador vectorManipulador = new VectorManipulador();
        
        vectorManipulador.cargar();

        System.out.println("\nVector cargado:");
        vectorManipulador.imprimir();

        System.out.println("\nVector invertido:");
        vectorManipulador.imprimir();
    }
}
