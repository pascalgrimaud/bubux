/**
 * 
 */
package fr.pgr.bubux.services.exemple;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import fr.pgr.bubux.services.exemple.ExempleBO;

/**
 * @author Ibu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@TransactionConfiguration(defaultRollback = true)
public class ExempleBOImplTest {

	@Autowired
	ExempleBO exempleBO;

	@Test
	public void testRecupererNomTest() throws Exception {
		String nomTest = exempleBO.recupererNomTest();
		assertSame("coucou", nomTest);
	}
}
