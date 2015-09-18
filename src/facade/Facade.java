/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.ProjectUser;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author martamiszczyk
 */
public class Facade
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager em = emf.createEntityManager();

    public Facade(EntityManagerFactory emf)
    {
        this.emf=emf;
    }
    
    public List getAllProjectUsers()
    {
        try
        {
            em.getTransaction().begin();
            List<ProjectUser> pu = em.createQuery("SELECT p FROM ProjectUser p").getResultList();
            em.getTransaction().commit();
            return pu;
        } finally
        {
            em.close();
        }

    }
    
    public ProjectUser findUser()
    {
        try
        {
            em.getTransaction().begin();
            ProjectUser pu = (ProjectUser) em.createQuery("SELECT p from ProjectUser p where p.userName= :userName").setParameter("userName", "Marta").getSingleResult();   
            em.getTransaction().commit();
            return pu;
        } finally
        {
            em.close();
        }

    }
}
