package fr.pgr.bubux.persistance.dao.impl;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import fr.pgr.bubux.persistance.dao.personne.PersonneDAO;
import fr.pgr.bubux.persistance.model.PersonneVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-test-persistance.xml")
@TransactionConfiguration(defaultRollback = true)
public class PersonneDAOImplTest {

	@Autowired
	PersonneDAO personneDAO;
	
	@Test
	public void testListPersonnes() {
		personneDAO.listPersonnes();
		assert(true);
	}
	
	@Test
	public void testListPersonnes2() {
		personneDAO.listPersonnes2();
		assert(true);
	}
	
	@Test
	public void testListPersonnes3() {
		personneDAO.listPersonnes3();
		assert(true);
	}
	

	@Transactional
	@Test
	public void testNewPersonne() {
		personneDAO.newPersonne("aaNom", "aaPrenom");
		personneDAO.newPersonne("bbNom", "bbPrenom");
		List<PersonneVO> listePersonnes = personneDAO.listPersonnes();
		boolean resultAa = false;
		boolean resultBb = false;
		for(PersonneVO personne : listePersonnes) {
			if ( "aaNom".equals(personne.getNom()) && "aaPrenom".equals(personne.getPrenom()) ) {
				resultAa = true;
			} else if ( "bbNom".equals(personne.getNom()) && "bbPrenom".equals(personne.getPrenom())) {
				resultBb = true;
			}
		}
		boolean result = resultAa && resultBb; 
		assertTrue(result);
	}
}
