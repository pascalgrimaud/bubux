/**
 * 
 */
package fr.pgr.bubux.persistance.dao.personne;

import java.util.List;

import fr.pgr.bubux.persistance.model.PersonneVO;

/**
 * @author Ibu
 *
 */
public interface PersonneDAO {
	String loadPersonne(int id);
	
	List<PersonneVO> listPersonnes();
	List<PersonneVO> listPersonnes2();
	List<PersonneVO> listPersonnes3();
	void newPersonne(String nom, String prenom);
}
