/**
 * 
 */
package fr.pgr.bubux.commun.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Ibu
 *
 */
@Entity
@Table(name = "exemple")
public class ExempleVO implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -8369023859798525241L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Version
	@Column(name = "TSTAMP")
	private Date tstamp;

	/**
	 * Constructeur vide
	 */
	public ExempleVO() {
		super();
	}

	/**
	 * 
	 * @param exemple
	 */
	public ExempleVO(ExempleVO exemple) {
		super();
		this.id = exemple.getId();
		this.code = exemple.getCode();
		this.description = exemple.getDescription();
		this.tstamp = exemple.getTstamp();
	}

	/**
	 * @param code
	 */
	public ExempleVO(String code) {
		super();
		this.code = code;
	}

	/**
	 * @param code
	 * @param description
	 */
	public ExempleVO(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	/**
	 * @param id
	 * @param code
	 * @param description
	 * @param tstamp
	 */
	public ExempleVO(Long id, String code, String description, Date tstamp) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.tstamp = tstamp;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the tstamp
	 */
	public Date getTstamp() {
		return tstamp;
	}

	/**
	 * @param tstamp
	 *            the tstamp to set
	 */
	public void setTstamp(Date tstamp) {
		this.tstamp = tstamp;
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
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tstamp == null) ? 0 : tstamp.hashCode());
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
		ExempleVO other = (ExempleVO) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tstamp == null) {
			if (other.tstamp != null)
				return false;
		} else if (!tstamp.equals(other.tstamp))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExempleVO [id=" + id + ", code=" + code + ", description="
				+ description + ", tstamp=" + tstamp + "]";
	}

}
