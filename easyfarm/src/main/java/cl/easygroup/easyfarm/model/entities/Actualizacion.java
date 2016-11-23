package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import java.util.Date;
import java.util.List;

import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the Actualizacion database table.
 * 
 */
@Entity
@NamedQuery(name="Actualizacion.findAll", query="SELECT a FROM Actualizacion a")
public class Actualizacion extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActualizacionPK id;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Almacen
	@ManyToOne
	@JoinColumn(name="idAlmacen")
	private Almacen almacen;

	//bi-directional many-to-many association to Articulo
	@ManyToMany(mappedBy="actualizacions")
	private List<Articulo> articulos;

	public Actualizacion() {
	}

	public ActualizacionPK getId() {
		return this.id;
	}

	public void setId(ActualizacionPK id) {
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