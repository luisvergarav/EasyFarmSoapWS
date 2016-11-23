package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Mensaje database table.
 * 
 */
@Embeddable
public class MensajePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idAlmacen;

	private int idMensaje;

	public MensajePK() {
	}
	public int getIdAlmacen() {
		return this.idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdMensaje() {
		return this.idMensaje;
	}
	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MensajePK)) {
			return false;
		}
		MensajePK castOther = (MensajePK)other;
		return 
			(this.idAlmacen == castOther.idAlmacen)
			&& (this.idMensaje == castOther.idMensaje);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAlmacen;
		hash = hash * prime + this.idMensaje;
		
		return hash;
	}
}