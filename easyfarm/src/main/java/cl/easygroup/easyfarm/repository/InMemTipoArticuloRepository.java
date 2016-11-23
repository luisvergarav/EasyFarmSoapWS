package cl.easygroup.easyfarm.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.TipoAlmacen;
import cl.easygroup.easyfarm.model.entities.TipoArticulo;
import cl.easygroup.easyfarm.model.entities.Usuario;


/**
 *
 * @author Vass Chile
 */
@Repository("tipoArticuloRepository")
public class InMemTipoArticuloRepository implements TipoArticuloRepository<TipoArticulo, String> {

	private static final Logger log = Logger.getLogger(InMemTipoArticuloRepository.class);

	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemTipoArticuloRepository() throws Exception {
	}

	@Override
	public boolean add(TipoArticulo entity) {
		// TODO Auto-generated method stub
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      
	      
	      entitymanager.persist(entity);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	      
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
	public void update(TipoArticulo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TipoArticulo get(String id) throws Exception {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("mysql-eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		return entitymanager.find(TipoArticulo.class, id);
	}

	@Override
	public Collection<TipoArticulo> getAll(String id) throws Exception {
		return null;
		

	}

	@Override
	public TipoArticulo get(Integer id) throws Exception {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("mysql-eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		return entitymanager.find(TipoArticulo.class, id);
	}

}
