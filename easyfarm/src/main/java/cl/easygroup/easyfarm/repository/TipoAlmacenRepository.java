package cl.easygroup.easyfarm.repository;

import cl.easygroup.easyfarm.model.entities.TipoAlmacen;

/**
 *
 * @author VassChile
 */
public interface TipoAlmacenRepository<TipoAlmacen, String> extends Repository<TipoAlmacen, String> {

	public TipoAlmacen get(Integer id) throws Exception;
 
    
}
