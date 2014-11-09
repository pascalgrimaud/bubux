/**
 * 
 */
package fr.pgr.bubux.services.exemple.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pgr.bubux.persistance.dao.personne.PersonneDAO;
import fr.pgr.bubux.persistance.model.PersonneVO;
import fr.pgr.bubux.services.exemple.ExempleBO;

/**
 * @author Ibu
 *
 */
@Service
public class ExempleBOImpl implements ExempleBO {

	@Autowired
	PersonneDAO personneDAO;

	public String recupererNomTest() {
		return "coucou";
	}

	public String retourneString(String entree) {
		return (new StringBuilder(entree)).reverse().toString();
	}

	public String recupererNom() {
		String result = "";

		List<PersonneVO> liste = personneDAO.listPersonnes();
		if (!liste.isEmpty()) {
			result = liste.get(0).getNom();
		}

		return result;
	}

	public String recupererNom2() {
		String result = "";

		List<PersonneVO> liste = personneDAO.listPersonnes2();
		if (!liste.isEmpty()) {
			result = liste.get(0).getNom();
		}

		return result;
	}

	public String recupererNom3() {
		String result = "";

		List<PersonneVO> liste = personneDAO.listPersonnes3();
		if (!liste.isEmpty()) {
			result = liste.get(0).getNom();
		}

		return result;
	}
}
