/**
 * 
 */
package fr.pgr.bubux.web.actions.accueil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import fr.pgr.bubux.services.exemple.ExempleBO;
import fr.pgr.bubux.web.actions.DefautAction;

/**
 * @author Ibu
 *
 */
public class AccueilAction extends DefautAction implements ServletRequestAware {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4038754750091135927L;

	/**
	 * Service exempleBO
	 */
	@Autowired
	private ExempleBO exempleBO;

	private String nom;

	/**
	 * Méthode par défaut
	 */
	@Override
	public String execute() {
		return SUCCESS;
	}

	/**
	 * Méthode par défaut
	 */
	public String testService() {
		nom = exempleBO.recupererNom();

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
	 * @return the exempleBO
	 */
	public ExempleBO getExempleBO() {
		return exempleBO;
	}

	/**
	 * @param exempleBO
	 *            the exempleBO to set
	 */
	public void setExempleBO(ExempleBO exempleBO) {
		this.exempleBO = exempleBO;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
