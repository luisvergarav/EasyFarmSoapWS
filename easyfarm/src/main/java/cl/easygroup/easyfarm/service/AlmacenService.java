package cl.easygroup.easyfarm.service;



import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Usuario;




/**
 *
 * @author Vass Chile
 */
public interface AlmacenService {

	public Almacen get(Integer id) throws Exception;
	public Collection<Almacen> getAll(String id) throws Exception;
}
