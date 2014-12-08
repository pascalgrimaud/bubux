/**
 * 
 */
package fr.pgr.bubux.persistance.dao;

import fr.pgr.bubux.commun.model.ExempleVO;
import fr.pgr.bubux.persistance.dao.defaut.DefautDAO;

/**
 * @author Ibu
 *
 */
public interface ExempleDAO extends DefautDAO<ExempleVO> {

	ExempleVO obtenirExempleParCode(String code);
	
	ExempleVO loadByCode(String code);

	void creerExemple(String code, String description);
}
