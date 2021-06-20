import model.Villain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Villain villain = em.find(Villain.class,4);
        em.persist(villain);
        em.remove(villain);


        em.getTransaction().commit();

    }
}
