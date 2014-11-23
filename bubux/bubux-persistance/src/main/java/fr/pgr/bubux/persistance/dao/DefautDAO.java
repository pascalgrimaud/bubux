/**
 * 
 */
package fr.pgr.bubux.persistance.dao;

import java.io.Serializable;

/**
 * @author Ibu
 *
 */
public interface DefautDAO<T> {

	T obtenir(Class<? extends T> uneClasse, Serializable uneCle);

	void inserer(final T t);

	void modifier(final T t);

	void mettreAJour(final T t);

	void supprimer(final T t);
}
