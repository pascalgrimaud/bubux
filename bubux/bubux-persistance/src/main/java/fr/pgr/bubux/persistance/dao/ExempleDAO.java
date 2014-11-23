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
public interface ExempleDAO extends DefautDAO<ExempleVO> {

	ExempleVO obtenirExempleParCode(String code);

	List<ExempleVO> obtenirTousLesExemples();

	void creerExemple(String code, String description);
}
