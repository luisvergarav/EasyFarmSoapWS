package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Ciudad database table.
 * 
 */
@Embeddable
public class CiudadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idCiudad;

	@Column(insertable=false, updatable=false)
	private int idRegion;

	public CiudadPK() {
	}
	public int getIdCiudad() {
		return this.idCiudad;
	}
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	public int getIdRegion() {
		return this.idRegion;
	}
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CiudadPK)) {
			return false;
		}
		CiudadPK castOther = (CiudadPK)other;
		return 
			(this.idCiudad == castOther.idCiudad)
			&& (this.idRegion == castOther.idRegion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCiudad;
		hash = hash * prime + this.idRegion;
		
		return hash;
	}
}