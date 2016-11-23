package cl.easygroup.easyfarm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Entity;
import cl.easygroup.easyfarm.model.entities.TipoAlmacen;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.repository.AlmacenRepository;
import cl.easygroup.easyfarm.repository.TipoAlmacenRepository;
import cl.easygroup.easyfarm.repository.UsuarioRepository;


/**
 *
 * @author Vass Chile
 */
@Service("tipoAlmacenService")
public class TipoAlmacenServiceImpl extends BaseService<TipoAlmacen, String> implements TipoAlmacenService {
 
	private TipoAlmacenRepository<TipoAlmacen, String> tipoAlmacenRepository;

	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Autowired
	public TipoAlmacenServiceImpl(TipoAlmacenRepository<TipoAlmacen, String> tipoAlmacenRepository) {
		super(tipoAlmacenRepository);
		this.tipoAlmacenRepository = tipoAlmacenRepository;
	}

	@Override
	public TipoAlmacen get(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return (TipoAlmacen) tipoAlmacenRepository.get(id);
	}
	@Override
	public Collection<TipoAlmacen> getAll(String id) throws Exception {
		return this.tipoAlmacenRepository.getAll(id);		
		
	}

	@Override
	public TipoAlmacen get(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
