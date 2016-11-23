package cl.easygroup.easyfarm.service;



import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Usuario;




/**
 *
 * @author Vass Chile
 */
public interface UsuarioService {

	public Usuario get(Integer id) throws Exception;
	public Collection<Usuario> getAll(String id) throws Exception;
}
