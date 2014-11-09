/**
 * 
 */
package fr.pgr.bubux.persistance.dao.personne.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.pgr.bubux.persistance.dao.DefautDAO;
import fr.pgr.bubux.persistance.dao.personne.PersonneDAO;
import fr.pgr.bubux.persistance.model.PersonneVO;

/**
 * Classe DAO pour l'entité Personne
 * 
 * @author Ibu
 *
 */
@Repository
public class PersonneDAOImpl extends DefautDAO implements PersonneDAO {

    @Override
    @Autowired
    public void init(final SessionFactory factory) {
        setSessionFactory(factory);
    }
    
	@Override
	public String loadPersonne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonneVO> listPersonnes() {
		Session session = getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<PersonneVO> personList = session.createQuery("from PersonneVO")
				.list();
		session.close();
		return personList;
	}

	@Transactional
	@Override
	public List<PersonneVO> listPersonnes2() {
		Session session = getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<PersonneVO> personList = session
				.createCriteria(PersonneVO.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		session.close();
		return personList;
	}
	
	@Transactional
	@Override
	public List<PersonneVO> listPersonnes3() {
		
		final List list = getHibernateTemplate().find("from PersonneVO");
		return list;
	}

}
