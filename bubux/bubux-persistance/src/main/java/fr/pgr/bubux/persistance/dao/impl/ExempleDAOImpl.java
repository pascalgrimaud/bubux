/**
 * 
 */
package fr.pgr.bubux.persistance.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.pgr.bubux.commun.model.ExempleVO;
import fr.pgr.bubux.persistance.dao.DefautDAO;
import fr.pgr.bubux.persistance.dao.ExempleDAO;

/**
 * @author Ibu
 *
 */
@Service
public class ExempleDAOImpl extends DefautDAO implements ExempleDAO {

	public ExempleVO chargerExemple(int id) {

		return null;
	}

	@Override
	public ExempleVO trouveExempleParCode(String code) {
		@SuppressWarnings("unchecked")
		List<ExempleVO> liste = (List<ExempleVO>) getHibernateTemplate().find(
				"from ExempleVO where code like ?", code);

		if (liste != null && !liste.isEmpty()) {
			return liste.get(0);
		}

		return null;
	}

	public List<ExempleVO> listerExemples() {
		@SuppressWarnings("unchecked")
		List<ExempleVO> liste = (List<ExempleVO>) getHibernateTemplate().find(
				"from ExempleVO");
		return liste;
	}

	public void creerExemple(String code, String description) {
		ExempleVO exemple = new ExempleVO(code, description);

		getHibernateTemplate().save(exemple);
	}

	public void modifierExemple(ExempleVO exempleVO) {

	}
}
