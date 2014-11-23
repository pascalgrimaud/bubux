/**
 * 
 */
package fr.pgr.bubux.services.exemple;

import fr.pgr.bubux.commun.model.ExempleVO;

/**
 * @author Ibu
 *
 */
public interface ExempleBO {
	/**
	 * Méthode pour récupérer un nom de test
	 * 
	 * @return nom de test
	 */
	public String recupererNomTest();

	/**
	 * Méthode pour inverser une chaine de caractères
	 * 
	 * @param entree
	 * @return retourne la chaine de caractères inversées
	 */
	public String retourneString(String entree);

	/**
	 * Méthode pour récupérer la description d'un exemple par son code
	 * 
	 * @param code
	 * @return
	 */
	public String recupererDescriptionExemple(String code);

	/**
	 * Méthode pour créer un exemple
	 * 
	 * @param code
	 * @param description
	 */
	public void creerExemple(String code, String description);

	/**
	 * Méthode pour trouver un exemple par code
	 * 
	 * @param code
	 */
	public ExempleVO trouverExempleParCode(String code);

	/**
	 * Méthode pour modifier un exemple
	 * 
	 * @param exemple
	 */
	public void modifierExemple(ExempleVO exemple);
}
