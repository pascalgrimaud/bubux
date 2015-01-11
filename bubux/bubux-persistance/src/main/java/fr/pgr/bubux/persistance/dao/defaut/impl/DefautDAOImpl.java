/**
 * 
 */
package fr.pgr.bubux.persistance.dao.defaut.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import fr.pgr.bubux.persistance.dao.defaut.DefautDAO;

/**
 * @author Ibu
 * @param <T>
 *
 */
public abstract class DefautDAOImpl<T> extends HibernateDaoSupport implements
		DefautDAO<T>, ApplicationContextAware {

	private ApplicationContext context;

	@Autowired
	public void init(final SessionFactory factory) {
		setSessionFactory(factory);
	}

	@Override
	public void setApplicationContext(final ApplicationContext ctx)
			throws BeansException {
		context = ctx;
	}
	
	@SuppressWarnings("unchecked")
	public final List<T> executeListCriteria(final DetachedCriteria requete) {
        return (ArrayList<T>) getHibernateTemplate().findByCriteria(requete);
    }
 
    @SuppressWarnings("unchecked")
	public final T executeObjectCriteria(final DetachedCriteria requete) {
        List<T> liste = (List<T>) getHibernateTemplate().findByCriteria(requete);
        if (liste.size() == 0) {
            return null;
        }
        return liste.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<T> getVOClass() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass()
				.getGenericSuperclass();
		return (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T load(Class<T> entityClass, Serializable identifier) {
		final Object result = this.getHibernateTemplate().load(entityClass,
				identifier, null);
		return (T) result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Class<T> entityClass, Serializable id) {
		final Object result = this.getHibernateTemplate().get(entityClass, id);
		return (T) result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T load(Serializable id) {
		final Object result = this.getHibernateTemplate().get(getVOClass(), id);
		return (T) result;
	}

	@Override
	public List<T> list() {
		return (List<T>) this.getHibernateTemplate().loadAll(getVOClass());
	}

	@Override
	public void delete(T entity) {
		// delete(entity.getIdentifier());
	}

	@Override
	public void delete(Integer identifier) {
		if (identifier != null) {
			// checks if it exists
			T object = load(identifier);
			if (object != null) {
				this.getHibernateTemplate().delete(object);
			}
		}
	}

	@Override
	public T save(final T entity) {
		this.getHibernateTemplate().saveOrUpdate(entity);
		return entity;
	}

}
