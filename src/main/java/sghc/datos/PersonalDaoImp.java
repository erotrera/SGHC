package sghc.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sghc.dominio.Personal;

@Stateless
public class PersonalDaoImp implements PersonalDAO{
    @PersistenceContext(unitName="HibernatePU")
    EntityManager em;

    @Override
    public List<Personal> buscarTodoPersonal() {
        return em.createNamedQuery("Personal.buscarTodo").getResultList();
    }

    @Override
    public Personal buscarPersonalPorId(Personal personal) {
        return em.find(Personal.class, personal.getCodPersonal());
    }

    @Override
    public Personal buscarPersonalPorDni(Personal personal) {
        Query query=em.createQuery("from Personal p where p.dni =: dni");
        query.setParameter("dni", personal.getDni());
        return (Personal) query.getSingleResult();
    }

    @Override
    public void insertarPersonal(Personal personal) {
        em.persist(personal);
    }

    @Override
    public void actualizarPersonal(Personal personal) {
        em.merge(personal);
    }

    @Override
    public void borrarPersonal(Personal personal) {
        em.remove(em.merge(personal));        
    }
    
    
    
    
}
