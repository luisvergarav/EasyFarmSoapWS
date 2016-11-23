package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Promocion database table.
 * 
 */
@Embeddable
public class PromocionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idAlmacen;

	private int idPromocion;

	public PromocionPK() {
	}
	public int getIdAlmacen() {
		return this.idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdPromocion() {
		return this.idPromocion;
	}
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PromocionPK)) {
			return false;
		}
		PromocionPK castOther = (PromocionPK)other;
		return 
			(this.idAlmacen == castOther.idAlmacen)
			&& (this.idPromocion == castOther.idPromocion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAlmacen;
		hash = hash * prime + this.idPromocion;
		
		return hash;
	}
}