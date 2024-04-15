
package pruebas;

import java.sql.Date;
import jakarta.persistence.*;
import org.apache.logging.log4j.*;
import sghc.dominio.Personal;

/**
 *
 * @author darioc
 */
public class ClienteEntidadPersonal {
   static Logger log=LogManager.getRootLogger();
   
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        
        //inicia transacción
        tx.begin();
        
        Personal p=new Personal(11111111,"nombre prueba","apellidos prueba",new Date(1,1,1990),1,"prueba domicilio 777", null,"prueba nacionalidad",0,"3333333333","prueba@prueba.com",Long.parseLong("77111111117"));
        
        //p.setCodLocalidad(1);
        //p.setEstado(1);
        
        System.out.println("\n"+p.toString()+"\n");
        
        log.debug("Objeto a persistir: "+p);
        
        //persisto el objeto
        em.persist(p);
        tx.commit();
        log.debug("Objeto persistido: "+p);
        em.close();
    }
   
}
