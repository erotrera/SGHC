package sghc.servicio;

import java.util.List;
import sghc.dominio.Personal;

/**
 *
 * @author darioc
 */
public interface PersonalServicio {
    public List<Personal> listarPersonal();
    public Personal encontrarPersonalPorID(Personal personal);
    public Personal encontrarPersonalPorDni(Personal personal);
    public void registrarPersonal(Personal personal);
    public void modificarPersonal(Personal personal);
    public void eliminarPersonal(Personal personal);
}
