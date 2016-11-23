package cl.easygroup.easyfarm.repository;


import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Entity;





/**
 *
 * @author Vass Chile
 * @param <TE>
 * @param <T>
 */
public interface ReadOnlyRepository<TE, T> {

    //long Count;
    /**
     *
     * @param id
     * @return
     */
    boolean contains(T id);

    /**
     *
     * @param id
     * @return
     */
    Entity get(T id) throws Exception;

    /**
     *
     * @return
     */
    Collection<TE> getAll(T t) throws Exception;
}
