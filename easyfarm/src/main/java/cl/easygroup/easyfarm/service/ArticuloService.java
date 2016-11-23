package cl.easygroup.easyfarm.service;



import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Articulo;
import cl.easygroup.easyfarm.model.entities.Usuario;




/**
 *
 * @author Vass Chile
 */
public interface ArticuloService {

	public Articulo get(String id) throws Exception;
	public Collection<Articulo> getAll(String id) throws Exception;
}
