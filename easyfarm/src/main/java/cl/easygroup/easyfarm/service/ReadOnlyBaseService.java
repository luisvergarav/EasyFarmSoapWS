package cl.easygroup.easyfarm.service;

import java.util.Collection;

import cl.easygroup.easyfarm.model.entities.Entity;
import cl.easygroup.easyfarm.repository.Repository;



/**
 *
 * @author Vass Chile
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
    
    public abstract Entity get(T id) throws Exception;
    public abstract Collection<TE> getAll(T t) throws Exception;
}
