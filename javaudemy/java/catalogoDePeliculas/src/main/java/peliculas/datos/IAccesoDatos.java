package peliculas.datos;

import peliculas.domain.Peliculas;
import java.util.List;
import peliculas.excepciones.*;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Peliculas> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Peliculas peliculas, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
