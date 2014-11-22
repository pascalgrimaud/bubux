/**
 * 
 */
package fr.pgr.bubux.web.actions;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/**
 * Classe mère de l'ensemble des classes Action du projet
 * 
 * @author Ibu
 *
 */
public abstract class DefautAction extends ActionSupport implements Preparable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2216786049713390397L;

	/**
	 * codeMenu
	 */
	protected int codeMenu;

	/**
	 * request
	 */
	protected HttpServletRequest request;

	/**
	 * session
	 */
	protected HttpSession session;

	/**
	 * context
	 */
	protected ServletContext context;

	/**
	 * TODO à compléter
	 */
	@Override
	public void prepare() {
		// initialisation du context
		context = ServletActionContext.getServletContext();

		// initialisation de la session
		session = request.getSession();

		// diverses autres initialisations à faire ici
	}

	/**
	 * Retourne le map de la session
	 * 
	 * @return le map de la session
	 */
	public Map<String, Object> getSessionMap() {
		return ActionContext.getContext().getSession();
	}

	/**
	 * @return the codeMenu
	 */
	public int getCodeMenu() {
		return codeMenu;
	}

	/**
	 * @param codeMenu
	 *            the codeMenu to set
	 */
	public void setCodeMenu(int codeMenu) {
		this.codeMenu = codeMenu;
	}

}
