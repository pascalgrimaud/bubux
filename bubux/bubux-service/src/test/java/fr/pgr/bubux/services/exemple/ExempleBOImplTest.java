/**
 * 
 */
package fr.pgr.bubux.services.exemple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import fr.pgr.bubux.commun.model.ExempleVO;

/**
 * @author Ibu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-test-service.xml")
@TransactionConfiguration(defaultRollback = true)
public class ExempleBOImplTest {

	@Autowired
	ExempleBO exempleBO;

	@Test
	public void testRecupererNomTest() throws Exception {
		String nomTest = exempleBO.recupererNomTest();
		assertEquals("coucou", nomTest);
	}

	@Test
	public void testRetourneString() throws Exception {
		String entree = "bonjour";
		String sortie = "ruojnob";
		String entreeRetourne = exempleBO.retourneString(entree);

		assertEquals(entreeRetourne, sortie);
	}

	@Transactional
	@Test
	public void testRecupererDescriptionExemple() throws Exception {
		exempleBO.creerExemple("TU01", "description TU01");
		String sortie = exempleBO.recupererDescriptionExemple("TU01");

		assertEquals("description TU01", sortie);
	}

	@Transactional
	@Test
	public void testCreerExemple() throws Exception {
		exempleBO.creerExemple("TU01", "description TU01");
		exempleBO.creerExemple("TU02", "description TU02");
		exempleBO.creerExemple("TU03", "description TU03");

		assert(true);
	}

	@Transactional
	@Test
	public void testModifierExemple() {
		ExempleVO exemple = exempleBO.trouverExempleParCode("EX01");
		assertNotNull(exemple);

		exemple.setCode("TU01");
		exemple.setDescription("modification exemple");
		exempleBO.modifierExemple(exemple);
	}
}
