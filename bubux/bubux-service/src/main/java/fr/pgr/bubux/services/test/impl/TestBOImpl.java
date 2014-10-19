/**
 * 
 */
package fr.pgr.bubux.services.test.impl;

import org.springframework.stereotype.Service;

import fr.pgr.bubux.services.test.TestBO;

/**
 * @author Ibu
 *
 */
@Service
public class TestBOImpl implements TestBO {
	/**
	 * {@inheritDoc}
	 */
	public String recupererNomTest() {
		return "coucou";
	}
}
