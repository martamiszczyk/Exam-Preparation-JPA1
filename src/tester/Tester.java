/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import entity.ProjectUser;
import facade.Facade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author martamiszczyk
 */
public class Tester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        ProjectUser pu1= new ProjectUser();
//        pu1.setUserName("Marta");  
//        em.persist(pu1);
        
        Facade facade = new Facade(emf);
        System.out.println(facade.findUser());
        
        em.getTransaction().commit();
    }
    
}
