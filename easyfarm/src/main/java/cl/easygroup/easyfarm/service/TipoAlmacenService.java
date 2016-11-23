package cl.easygroup.easyfarm.service;



import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.TipoAlmacen;
import cl.easygroup.easyfarm.model.entities.Usuario;




/**
 *
 * @author Vass Chile
 */
public interface TipoAlmacenService {

	public TipoAlmacen get(Integer id) throws Exception;
	public Collection<TipoAlmacen> getAll(String id) throws Exception;
}
