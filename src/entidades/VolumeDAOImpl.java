package entidades;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class VolumeDAOImpl implements VolumeDAO{
	protected static EntityManager em; 
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("biblioteca");
		if (em == null) {
			em = factory.createEntityManager();
		}
		return em;
	}

	public VolumeDAOImpl() {
		this.em = getEntityManager();
	}

	//INSERT

	public void persist(Volume p) {
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	//SELECT

	public Volume selectById(final int id) {
		return em.find(Volume.class, id);
	}

	//UPDATE

	public void merge(Volume v) {
		try{
			em.getTransaction().begin();
			em.merge(v);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	//DELETE

	public void removeById(final int id){
		try {
			em.getTransaction().begin();
			Volume p = selectById(id);
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
