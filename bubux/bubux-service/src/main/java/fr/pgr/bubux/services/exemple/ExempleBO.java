/**
 * 
 */
package fr.pgr.bubux.services.exemple;

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
	 * Méthode pour récupérer un nom en BD
	 * @return
	 */
	public String recupererNom();
	public String recupererNom2();
	public String recupererNom3();
}
