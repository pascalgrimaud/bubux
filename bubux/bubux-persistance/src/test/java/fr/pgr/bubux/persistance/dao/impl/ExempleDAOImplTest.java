package fr.pgr.bubux.persistance.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import fr.pgr.bubux.commun.model.ExempleVO;
import fr.pgr.bubux.persistance.dao.ExempleDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-test-persistance.xml")
@TransactionConfiguration(defaultRollback = true)
public class ExempleDAOImplTest {

	@Autowired
	ExempleDAO exempleDAO;

	@Transactional
	@Test
	public void testObtenirExempleParCode() {
		ExempleVO exemple = new ExempleVO("TU01", "test exemple 01");
		exempleDAO.inserer(exemple);
		
		ExempleVO exempleResult = exempleDAO.obtenirExempleParCode("TU01");
		
		assertNotNull(exempleResult);
		assertNotNull(exempleResult.getId());
		assertEquals("TU01", exempleResult.getCode());
		assertEquals("test exemple 01", exempleResult.getDescription());
		assertNotNull(exempleResult.getTstamp());
	}

	@Transactional
	@Test
	public void testObtenirTousLesExemples() {
		ExempleVO exemple1 = new ExempleVO("TU01", "test exemple 01");
		exempleDAO.inserer(exemple1);
		List<ExempleVO> listeAvant = exempleDAO.obtenirTousLesExemples();

		ExempleVO exemple2 = new ExempleVO("TU02", "test exemple 02");
		exempleDAO.inserer(exemple2);
		List<ExempleVO> listeApres = exempleDAO.obtenirTousLesExemples();

		assertNotNull(listeAvant);
		assertNotNull(listeApres);
		assertEquals(listeAvant.size() + 1, listeApres.size());
	}

	@Transactional
	@Test
	public void testModifier() {
		ExempleVO exemple1 = new ExempleVO("TU01", "test exemple 01");
		exempleDAO.inserer(exemple1);
		
		ExempleVO exempleAModifier = exempleDAO.obtenirExempleParCode("TU01");
		Long id = exempleAModifier.getId();
		exempleAModifier.setCode("TU02");
		exempleAModifier.setDescription("test modification 02");
		exempleDAO.modifier(exempleAModifier);
		
		ExempleVO exempleResult = exempleDAO.obtenir(ExempleVO.class, id);
		assertNotNull(exempleResult);
		assertEquals("TU02",exempleResult.getCode());
		assertEquals("test modification 02", exempleResult.getDescription());
		System.out.println(exempleResult);
	}
}
