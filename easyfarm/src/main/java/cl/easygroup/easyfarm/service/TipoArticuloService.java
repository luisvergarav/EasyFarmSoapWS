package cl.easygroup.easyfarm.service;



import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Articulo;
import cl.easygroup.easyfarm.model.entities.TipoArticulo;
import cl.easygroup.easyfarm.model.entities.Usuario;




/**
 *
 * @author Vass Chile
 */
public interface TipoArticuloService {

	public TipoArticulo get(Integer id) throws Exception;
	public Collection<TipoArticulo> getAll(String id) throws Exception;
}
