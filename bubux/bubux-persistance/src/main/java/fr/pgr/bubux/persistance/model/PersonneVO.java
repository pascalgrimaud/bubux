/**
 * 
 */
package fr.pgr.bubux.persistance.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ibu
 *
 */
@Entity
@Table(name = "personne")
public class PersonneVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4212235648695491111L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "dateNaiss")
	private Date dateNaiss;

	public PersonneVO() {
	}

	public PersonneVO(Long id, String nom, String prenom, Date dateNaiss) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaiss
	 */
	public Date getdateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss
	 *            the dateNaiss to set
	 */
	public void setdateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonneVO [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", dateNaiss=" + dateNaiss + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateNaiss == null) ? 0 : dateNaiss.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonneVO other = (PersonneVO) obj;
		if (dateNaiss == null) {
			if (other.dateNaiss != null)
				return false;
		} else if (!dateNaiss.equals(other.dateNaiss))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

}
