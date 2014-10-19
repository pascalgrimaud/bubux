/**
 * 
 */
package fr.pgr.bubux.web.actions.accueil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

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
	 * Méthode par défaut
	 */
	@Override
	public String execute() {
		System.out.println("hello ici !");

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
}
