package cl.easygroup.easyfarm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Ubicacion;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.repository.AlmacenRepository;
import cl.easygroup.easyfarm.repository.UbicacionRepository;
import cl.easygroup.easyfarm.repository.UsuarioRepository;


/**
 *
 * @author Vass Chile
 */
@Service("ubicacionService")
public class UbicacionServiceImpl extends BaseService<Ubicacion, String> implements UbicacionService {
 
	private UbicacionRepository<Ubicacion, String> ubicacionRepository;

	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Autowired
	public UbicacionServiceImpl(UbicacionRepository<Ubicacion, String> ubicacionRepository) {
		super(ubicacionRepository);
		this.ubicacionRepository = ubicacionRepository;
	}

	@Override
	public Ubicacion get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (Ubicacion) ubicacionRepository.get(id);
	}
	@Override
	public Collection<Ubicacion> getAll(String id) throws Exception {
		return this.ubicacionRepository.getAll(id);		
		
	}

}
