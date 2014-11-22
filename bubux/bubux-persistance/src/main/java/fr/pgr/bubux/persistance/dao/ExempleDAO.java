/**
 * 
 */
package fr.pgr.bubux.persistance.dao;

import java.util.List;

import fr.pgr.bubux.commun.model.ExempleVO;

/**
 * @author Ibu
 *
 */
public interface ExempleDAO {
	ExempleVO chargerExemple(int id);
	ExempleVO trouveExempleParCode(String code);
	List<ExempleVO> listerExemples();
	void creerExemple(String code, String description);
	void modifierExemple(ExempleVO exempleVO);
}
