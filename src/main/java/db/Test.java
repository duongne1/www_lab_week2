package db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Test {
    public static void main(String[] args) {
        EntityManager em = Connection.getInstance().entityManagerFactory().createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            System.out.println("ok");
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
