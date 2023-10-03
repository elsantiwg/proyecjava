
//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        
        inicio:
        for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue inicio;//ir a la linea de codigo de la etiqueta
            }   
            System.out.println("contador = " + contador);
        }
        
//        for( var contador = 0 ; contador < 3 ; contador++ ){
//            if( contador % 2 == 0){
//                System.out.println("contador = " + contador);
//                break;
//            }   
//        }
        
//        var contador = 0;
//        while( contador < 3 ){
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//        var contador = 0;
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        }while( contador < 3);
    }
}
