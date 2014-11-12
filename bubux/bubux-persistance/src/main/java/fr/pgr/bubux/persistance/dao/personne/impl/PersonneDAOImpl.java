/**
 * 
 */
package fr.pgr.bubux.persistance.dao.personne.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
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

//	@Autowired
//	private SessionFactory sessionFactory;

	@Override
	public String loadPersonne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<PersonneVO> listPersonnes() {
//		Session session = currentSession();
//		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<PersonneVO> personList = currentSession().createQuery("from PersonneVO")
				.list();

//		session.getTransaction().commit();
		return personList;
	}

	@Transactional
	@Override
	public List<PersonneVO> listPersonnes2() {
//		Session session = currentSession();
//		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<PersonneVO> personList = currentSession()
				.createCriteria(PersonneVO.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
//		session.getTransaction().commit();
		return personList;
	}
	
	@Transactional
	@Override
	public List<PersonneVO> listPersonnes3() {
//		currentSession().beginTransaction();
		
		final List list = getHibernateTemplate().find("from PersonneVO");
		
//		currentSession().getTransaction().commit();
		return list;
	}
	
	@Transactional
	@Override
	public void newPersonne(String nom, String prenom) {
		PersonneVO personne = new PersonneVO();
		personne.setNom(nom);
		personne.setPrenom(prenom);
		personne.setdateNaiss(new Date());

		getHibernateTemplate().save(personne);
	}

}
