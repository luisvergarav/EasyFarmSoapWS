package cl.easygroup.easyfarm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Articulo;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.repository.AlmacenRepository;
import cl.easygroup.easyfarm.repository.ArticuloRepository;
import cl.easygroup.easyfarm.repository.UsuarioRepository;

/**
 *
 * @author Vass Chile
 */
@Service("articuloService")
public class ArticuloServiceImpl extends BaseService<Articulo, String> implements ArticuloService {

	private ArticuloRepository<Articulo, String> articuloRepository;

	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Autowired
	public ArticuloServiceImpl(ArticuloRepository<Articulo, String> articuloRepository) {
		super(articuloRepository);
		this.articuloRepository = articuloRepository;
	}

	@Override
	public Articulo get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (Articulo) articuloRepository.get(id);
	}

	@Override
	public Collection<Articulo> getAll(String id) throws Exception {
		return this.articuloRepository.getAll(id);

	}

}
