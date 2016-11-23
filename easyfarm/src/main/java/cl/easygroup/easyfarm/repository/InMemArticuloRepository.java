package cl.easygroup.easyfarm.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Articulo;
import cl.easygroup.easyfarm.model.entities.Usuario;


/**
 *
 * @author Vass Chile
 */
@Repository("articuloRepository")
public class InMemArticuloRepository implements ArticuloRepository<Articulo, String> {

	private static final Logger log = Logger.getLogger(InMemArticuloRepository.class);

	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemArticuloRepository() throws Exception {
	}

	@Override
	public boolean add(Articulo entity) {
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
	public void update(Articulo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Almacen get(String id) throws Exception {

		return null;
	}

	@Override
	public Collection<Articulo> getAll(String id) throws Exception {
		return null;
		

	}

}
