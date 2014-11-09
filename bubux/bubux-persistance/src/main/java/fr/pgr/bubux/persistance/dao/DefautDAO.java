/**
 * 
 */
package fr.pgr.bubux.persistance.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @author Ibu
 *
 */
public abstract class DefautDAO extends HibernateDaoSupport implements
		ApplicationContextAware {

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
}
