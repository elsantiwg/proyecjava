package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "5544432511");
//        personaDao.insertar(personaNueva);
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcespar@gmail.com", "335551145145");
//       personaDao.actualizar(personaModificar);
//       
        Persona personaEliminar = new Persona(3);
        personaDao.eliminar(personaEliminar);
        
        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
