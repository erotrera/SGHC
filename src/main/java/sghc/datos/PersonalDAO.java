package sghc.datos;

import java.util.List;
import sghc.dominio.Personal;

/**
 *
 * @author darioc
 */
public interface PersonalDAO {
      
    public List<Personal> buscarTodoPersonal();
    public Personal buscarPersonalPorId(Personal personal);
    public Personal buscarPersonalPorDni(Personal personal);
    public void insertarPersonal(Personal personal);
    public void actualizarPersonal(Personal personal);
    public void borrarPersonal(Personal personal);
    
}
