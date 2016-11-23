package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Articulo database table.
 * 
 */
@Embeddable
public class ArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idAlmacen;

	private int idArticulo;

	public ArticuloPK() {
	}
	public int getIdAlmacen() {
		return this.idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdArticulo() {
		return this.idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ArticuloPK)) {
			return false;
		}
		ArticuloPK castOther = (ArticuloPK)other;
		return 
			(this.idAlmacen == castOther.idAlmacen)
			&& (this.idArticulo == castOther.idArticulo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAlmacen;
		hash = hash * prime + this.idArticulo;
		
		return hash;
	}
}