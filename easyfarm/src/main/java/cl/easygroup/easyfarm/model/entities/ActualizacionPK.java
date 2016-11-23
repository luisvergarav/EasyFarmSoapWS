package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Actualizacion database table.
 * 
 */
@Embeddable
public class ActualizacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idAlmacen;

	private int idActualizacion;

	public ActualizacionPK() {
	}
	public int getIdAlmacen() {
		return this.idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdActualizacion() {
		return this.idActualizacion;
	}
	public void setIdActualizacion(int idActualizacion) {
		this.idActualizacion = idActualizacion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActualizacionPK)) {
			return false;
		}
		ActualizacionPK castOther = (ActualizacionPK)other;
		return 
			(this.idAlmacen == castOther.idAlmacen)
			&& (this.idActualizacion == castOther.idActualizacion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAlmacen;
		hash = hash * prime + this.idActualizacion;
		
		return hash;
	}
}