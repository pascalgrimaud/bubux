/**
 * 
 */
package fr.pgr.bubux.persistance.dao.impl;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import fr.pgr.bubux.persistance.dao.DefautDAO;

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

	public Object getBean(final String name) {
		return context.getBean(name);
	}

	public final T obtenir(final Class<? extends T> uneClasse,
			final Serializable uneCle) throws HibernateException {
		try {
			final T unObjet = (T) this.getHibernateTemplate().load(uneClasse,
					uneCle);
			return unObjet;
		} catch (final HibernateException e) {
			throw e;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public void inserer(final T object) throws HibernateException {
		try {
			getHibernateTemplate().save(object);
		} catch (final HibernateException e) {
			throw e;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public void modifier(final T object) throws HibernateException {
		try {
			getHibernateTemplate().update(object);
		} catch (final HibernateException e) {
			throw e;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public void mettreAJour(final T object) throws HibernateException {
		try {
			getHibernateTemplate().saveOrUpdate(object);
		} catch (final HibernateException e) {
			throw e;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public void supprimer(final T object) throws HibernateException {
		try {
			getHibernateTemplate().delete(object);
		} catch (final HibernateException e) {
			throw e;
		} catch (DataAccessException e) {
			throw e;
		}
	}
}
