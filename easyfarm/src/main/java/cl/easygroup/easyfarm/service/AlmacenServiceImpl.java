package cl.easygroup.easyfarm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.repository.AlmacenRepository;
import cl.easygroup.easyfarm.repository.UsuarioRepository;


/**
 *
 * @author Vass Chile
 */
@Service("almacenService")
public class AlmacenServiceImpl extends BaseService<Almacen, String> implements AlmacenService {
 
	private AlmacenRepository<Almacen, String> almacenRepository;

	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Autowired
	public AlmacenServiceImpl(AlmacenRepository<Almacen, String> almacenRepository) {
		super(almacenRepository);
		this.almacenRepository = almacenRepository;
	}

	@Override
	public Almacen get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (Almacen) almacenRepository.get(id);
	}
	@Override
	public Collection<Almacen> getAll(String id) throws Exception {
		return this.almacenRepository.getAll(id);		
		
	}

	@Override
	public Almacen get(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return (Almacen) almacenRepository.get(id);
	}

}
