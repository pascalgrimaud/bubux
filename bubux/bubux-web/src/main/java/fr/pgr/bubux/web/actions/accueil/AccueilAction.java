/**
 * 
 */
package fr.pgr.bubux.web.actions.accueil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import fr.pgr.bubux.services.test.TestBO;
import fr.pgr.bubux.web.actions.GenericAction;

/**
 * @author Ibu
 *
 */
public class AccueilAction extends GenericAction implements ServletRequestAware {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4038754750091135927L;

	/**
	 * Service testBO
	 */
	@Autowired
	private TestBO testBO;

	/**
	 * Méthode par défaut
	 */
	@Override
	public String execute() {
		System.out.println("hello ici !");

		String test = testBO.recupererNomTest();
		System.out.println("test=" + test);

		return SUCCESS;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void setServletRequest(final HttpServletRequest arg0) {
		request = arg0;
	}

	/**
	 * @return the testBO
	 */
	public TestBO getTestBO() {
		return testBO;
	}

	/**
	 * @param testBO
	 *            the testBO to set
	 */
	public void setTestBO(TestBO testBO) {
		this.testBO = testBO;
	}

}
