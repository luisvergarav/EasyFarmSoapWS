package cl.easygroup.easyfarm.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import cl.easygroup.easyfarm.model.entities.Usuario;


/**
 *
 * @author Vass Chile
 */
@Repository("usuarioRepository")
public class InMemUsuarioRepository implements UsuarioRepository<Usuario, String> {

	private static final Logger log = Logger.getLogger(InMemUsuarioRepository.class);

	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemUsuarioRepository() throws Exception {
	}

	@Override
	public boolean add(Usuario entity) {
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
	public void update(Usuario entity) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	     
	      
	      entitymanager.getTransaction( ).begin( );

	      
	      
	      entitymanager.merge(entity);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	      

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario get(String id) throws Exception {

		return null;
	}

	@Override
	public Collection<Usuario> getAll(String id) throws Exception {
		return null;
		

	}

	@Override
	public Usuario get(Integer id) throws Exception {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	     return entitymanager.find( Usuario.class, id);
	}

}
