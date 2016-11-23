package cl.easygroup.easyfarm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.easygroup.easyfarm.model.entities.Entity;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.repository.UsuarioRepository;


/**
 *
 * @author Vass Chile
 */
@Service("usuarioService")
public class UsuarioServiceImpl extends BaseService<Usuario, String> implements UsuarioService {
 
	private UsuarioRepository<Usuario, String> usuarioRepository;

	/**
	 *
	 * @param Poliza
	 *            Repository
	 */
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository<Usuario, String> polizaRepository) {
		super(polizaRepository);
		this.usuarioRepository = polizaRepository;
	}

	@Override
	public Usuario get(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return (Usuario) usuarioRepository.get(id);
	}
	@Override
	public Collection<Usuario> getAll(String id) throws Exception {
		return this.usuarioRepository.getAll(id);		
		
	}

	@Override
	public Usuario get(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
