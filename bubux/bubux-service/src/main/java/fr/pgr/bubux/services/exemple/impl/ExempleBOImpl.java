/**
 * 
 */
package fr.pgr.bubux.services.exemple.impl;

import org.springframework.stereotype.Service;

import fr.pgr.bubux.services.exemple.ExempleBO;

/**
 * @author Ibu
 *
 */
@Service
public class ExempleBOImpl implements ExempleBO {
	public String recupererNomTest() {
		return "coucou";
	}

	public String retourneString(String entree) {
		return (new StringBuilder(entree)).reverse().toString();
	}
}
