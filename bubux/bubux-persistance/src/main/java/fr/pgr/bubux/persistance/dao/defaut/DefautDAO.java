/**
 * 
 */
package fr.pgr.bubux.persistance.dao.defaut;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ibu
 *
 */
public interface DefautDAO<T> {

	Class<T> getVOClass();

	T load(Class<T> entityClass, Serializable identifier);

	T get(Class<T> entityClass, Serializable id);

	T load(Serializable id);

	List<T> list();

	void delete(T entity);

	void delete(Integer identifier);

	T save(final T entity);
}
