/**
 * 
 */
package fr.pgr.bubux.persistance.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.pgr.bubux.commun.model.ExempleVO;
import fr.pgr.bubux.persistance.dao.ExempleDAO;

/**
 * @author Ibu
 *
 */
@Service
public class ExempleDAOImpl extends DefautDAOImpl<ExempleVO> implements
		ExempleDAO {

	@Override
	public ExempleVO obtenirExempleParCode(String code) {
		@SuppressWarnings("unchecked")
		List<ExempleVO> liste = (List<ExempleVO>) getHibernateTemplate().find(
				"from ExempleVO where code like ?", code);

		if (liste != null && !liste.isEmpty()) {
			return liste.get(0);
		}

		return null;
	}

	@Override
	public List<ExempleVO> obtenirTousLesExemples() {
		@SuppressWarnings("unchecked")
		List<ExempleVO> liste = (List<ExempleVO>) getHibernateTemplate().find(
				"from ExempleVO");
		return liste;
	}

	@Override
	public void creerExemple(String code, String description) {
		ExempleVO exemple = new ExempleVO(code, description);
		inserer(exemple);
	}
}
