package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Comuna database table.
 * 
 */
@Embeddable
public class ComunaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idComuna;

	@Column(insertable=false, updatable=false)
	private int idCiudad;

	@Column(insertable=false, updatable=false)
	private int idRegion;

	public ComunaPK() {
	}
	public int getIdComuna() {
		return this.idComuna;
	}
	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
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
		if (!(other instanceof ComunaPK)) {
			return false;
		}
		ComunaPK castOther = (ComunaPK)other;
		return 
			(this.idComuna == castOther.idComuna)
			&& (this.idCiudad == castOther.idCiudad)
			&& (this.idRegion == castOther.idRegion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idComuna;
		hash = hash * prime + this.idCiudad;
		hash = hash * prime + this.idRegion;
		
		return hash;
	}
}