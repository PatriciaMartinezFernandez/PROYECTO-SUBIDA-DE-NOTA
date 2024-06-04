package main.java;

import jakarta.persistence.EntityManager;

public class PropietarioDAO {
	private EntityManager em;

	public PropietarioDAO(EntityManager em) {
		this.em = em;
	}

	public void crearPropietario(Propietario propietario) {
		em.getTransaction().begin();
		em.persist(propietario);
		em.getTransaction().commit();
	}

	public Propietario buscarPropietario(String dni) {
		return em.find(Propietario.class, dni);
	}

	public void actualizarPropietario(Propietario propietario) {
		em.getTransaction().begin();
		em.merge(propietario);
		em.getTransaction().commit();
	}

	public void eliminarPropietario(String dni) {
		Propietario propietario = buscarPropietario(dni);
		if (propietario != null) {
			em.getTransaction().begin();
			em.remove(propietario);
			em.getTransaction().commit();
		}
	}

}
