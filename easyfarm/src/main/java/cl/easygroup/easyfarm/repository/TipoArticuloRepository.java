package cl.easygroup.easyfarm.repository;







/**
 *
 * @author VassChile
 */
public interface TipoArticuloRepository<TipoArticulo, String> extends Repository<TipoArticulo, String> {

    
	public TipoArticulo get(Integer id) throws Exception;
    
}
