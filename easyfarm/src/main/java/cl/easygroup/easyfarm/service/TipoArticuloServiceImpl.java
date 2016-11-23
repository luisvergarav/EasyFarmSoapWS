package cl.easygroup.easyfarm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Articulo;
import cl.easygroup.easyfarm.model.entities.TipoArticulo;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.repository.AlmacenRepository;
import cl.easygroup.easyfarm.repository.ArticuloRepository;
import cl.easygroup.easyfarm.repository.TipoArticuloRepository;
import cl.easygroup.easyfarm.repository.UsuarioRepository;

/**
 *
 * @author Vass Chile
 */
@Service("tipoArticuloService")
public class TipoArticuloServiceImpl extends BaseService<TipoArticulo, String> implements TipoArticuloService {

	private TipoArticuloRepository<TipoArticulo, String> tipoArticuloRepository;

	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Autowired
	public TipoArticuloServiceImpl(TipoArticuloRepository<TipoArticulo, String> tipoArticuloRepository) {
		super(tipoArticuloRepository);
		this.tipoArticuloRepository = tipoArticuloRepository;
	}

	@Override
	public TipoArticulo get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (TipoArticulo) tipoArticuloRepository.get(id);
	}

	@Override
	public Collection<TipoArticulo> getAll(String id) throws Exception {
		return this.tipoArticuloRepository.getAll(id);

	}

	@Override
	public TipoArticulo get(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return (TipoArticulo) tipoArticuloRepository.get(id);
	}

}
