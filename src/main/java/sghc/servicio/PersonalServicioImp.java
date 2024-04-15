
package sghc.servicio;

import java.util.List;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import sghc.dominio.Personal;
import sghc.datos.PersonalDAO;

/**
 *
 * @author darioc
 */
@Stateless
public class PersonalServicioImp implements PersonalServicio{
    
    @Inject
    private PersonalDAO personalDao;
    
    @Override
    public List<Personal> listarPersonal() {
        return personalDao.buscarTodoPersonal();
    }

    @Override
    public Personal encontrarPersonalPorID(Personal personal) {
        return personalDao.buscarPersonalPorId(personal);
    }

    @Override
    public Personal encontrarPersonalPorDni(Personal personal) {
        return personalDao.buscarPersonalPorDni(personal);
    }

    @Override
    public void registrarPersonal(Personal personal) {
        personalDao.insertarPersonal(personal);
    }

    @Override
    public void modificarPersonal(Personal personal) {
        personalDao.actualizarPersonal(personal);
    }

    @Override
    public void eliminarPersonal(Personal personal) {
        personalDao.borrarPersonal(personal);
    }
    
}
