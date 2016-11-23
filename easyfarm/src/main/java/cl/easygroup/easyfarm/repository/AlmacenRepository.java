package cl.easygroup.easyfarm.repository;







/**
 *
 * @author VassChile
 */
public interface AlmacenRepository<Almacen, String> extends Repository<Almacen, String> {

    
	public Almacen get(Integer id) throws Exception;
    
}
