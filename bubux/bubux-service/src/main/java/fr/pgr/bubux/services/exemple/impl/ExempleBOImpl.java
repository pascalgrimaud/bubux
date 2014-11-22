/**
 * 
 */
package fr.pgr.bubux.services.exemple.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pgr.bubux.commun.model.ExempleVO;
import fr.pgr.bubux.persistance.dao.ExempleDAO;
import fr.pgr.bubux.services.exemple.ExempleBO;

/**
 * @author Ibu
 *
 */
@Service
public class ExempleBOImpl implements ExempleBO {

	@Autowired
	ExempleDAO exempleDAO;

	public String recupererNomTest() {
		return "coucou";
	}

	public String retourneString(String entree) {
		return (new StringBuilder(entree)).reverse().toString();
	}

	public String recupererDescriptionExemple(String code) {
		String result = "";

		ExempleVO exemple = exempleDAO.trouveExempleParCode(code);
		if (exemple != null) {
			result = exemple.getDescription();
		}

		return result;
	}

	public void creerExemple(String code, String description) {
		exempleDAO.creerExemple(code, description);
	}
}
