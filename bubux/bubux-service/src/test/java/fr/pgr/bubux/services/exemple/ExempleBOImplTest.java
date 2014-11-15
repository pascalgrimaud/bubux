/**
 * 
 */
package fr.pgr.bubux.services.exemple;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

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

	@Test
	public void testRecupererNom() throws Exception {
		String sortie = exempleBO.recupererNom();

		assertEquals("lol", sortie);
	}

	@Test
	public void testRecupererNom2() throws Exception {
		String sortie = exempleBO.recupererNom2();

		assertEquals("lol", sortie);
	}

	@Test
	public void testRecupererNom3() throws Exception {
		String sortie = exempleBO.recupererNom3();

		assertEquals("lol", sortie);
	}
	
	@Transactional
	@Test
	public void testNewPersonne() throws Exception {
		exempleBO.newPersonne("cccNom", "cccPrenom");
		exempleBO.newPersonne("dddNom", "dddPrenom");
		exempleBO.newPersonne("eeeNom", "eeePrenom");

		assert(true);
	}
}
