package fr.pgr.bubux.persistance.dao.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
	public void testCreerExemple() {
		exempleDAO.creerExemple("EX01", "test exemple");
		ExempleVO exemple = exempleDAO.trouveExempleParCode("EX01");

		assertNotNull(exemple);
		assertTrue("EX01".equals(exemple.getCode()));
		assertTrue("test exemple".equals(exemple.getDescription()));
	}

	@Transactional
	@Test
	public void testListerExemples() {
		List<ExempleVO> listeAvant = exempleDAO.listerExemples();

		exempleDAO.creerExemple("EX01", "test exemple");

		List<ExempleVO> listeApres = exempleDAO.listerExemples();

		int nbExemplesAvant = 0;
		if (listeAvant != null && !listeAvant.isEmpty()) {
			nbExemplesAvant = listeAvant.size();
		}

		int nbExemplesApres = 0;
		if (listeApres != null && !listeApres.isEmpty()) {
			nbExemplesApres = listeApres.size();
		}

		assertTrue(nbExemplesAvant + 1 == nbExemplesApres);
	}
}
