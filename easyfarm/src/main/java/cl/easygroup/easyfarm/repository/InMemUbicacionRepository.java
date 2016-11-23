package cl.easygroup.easyfarm.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Ubicacion;
import cl.easygroup.easyfarm.model.entities.Usuario;


/**
 *
 * @author Vass Chile
 */
@Repository("ubicacionRepository")
public class InMemUbicacionRepository implements UbicacionRepository<Ubicacion, String> {

	private static final Logger log = Logger.getLogger(InMemUbicacionRepository.class);

	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemUbicacionRepository() throws Exception {
	}

	@Override
	public boolean add(Ubicacion entity) {
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
	public void update(Ubicacion entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ubicacion get(String id) throws Exception {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	     return entitymanager.find( Ubicacion.class, id);
	}

	@Override
	public Collection<Ubicacion> getAll(String id) throws Exception {
		return null;
		

	}

}
