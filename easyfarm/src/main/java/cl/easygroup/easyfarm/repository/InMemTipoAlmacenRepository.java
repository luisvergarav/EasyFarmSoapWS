package cl.easygroup.easyfarm.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.TipoAlmacen;
import cl.easygroup.easyfarm.model.entities.Usuario;

/**
 *
 * @author Vass Chile
 */
@Repository("tipoAlmacenRepository")
public class InMemTipoAlmacenRepository implements TipoAlmacenRepository<TipoAlmacen, String> {

	private static final Logger log = Logger.getLogger(InMemTipoAlmacenRepository.class);

	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemTipoAlmacenRepository() throws Exception {
	}

	@Override
	public boolean add(TipoAlmacen entity) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("mysql-eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		entitymanager.persist(entity);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

		return true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.falabella.login.domain.repository.Repository#remove(java.lang.Object)
	 */
	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TipoAlmacen entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TipoAlmacen get(String id) throws Exception {

		return null;
	}

	@Override
	public Collection<TipoAlmacen> getAll(String id) throws Exception {
		return null;

	}

	@Override
	public TipoAlmacen get(Integer id) throws Exception {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("mysql-eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		return entitymanager.find(TipoAlmacen.class, id);
	}

}
