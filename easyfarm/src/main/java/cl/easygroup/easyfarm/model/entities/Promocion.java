package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the Promocion database table.
 * 
 */
@Entity
@NamedQuery(name="Promocion.findAll", query="SELECT p FROM Promocion p")
public class Promocion extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PromocionPK id;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Almacen
	@ManyToOne
	@JoinColumn(name="idAlmacen")
	private Almacen almacen;

	//bi-directional many-to-many association to Articulo
	@ManyToMany(mappedBy="promocions")
	private List<Articulo> articulos;

	public Promocion() {
	}

	public PromocionPK getId() {
		return this.id;
	}

	public void setId(PromocionPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Almacen getAlmacen() {
		return this.almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

}