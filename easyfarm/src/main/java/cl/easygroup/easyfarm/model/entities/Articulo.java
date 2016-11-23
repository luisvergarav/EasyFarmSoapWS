package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the Articulo database table.
 * 
 */
@Entity
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
@Table(name="Articulo")
public class Articulo extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ArticuloPK id;

	@Temporal(TemporalType.DATE)
	private Date fechaActualizacion;

	private String nombreArticulo;

	private int precio;

	//bi-directional many-to-many association to Actualizacion
	@ManyToMany
	@JoinTable(
		name="ActualizacionArticulo"
		, joinColumns={
			@JoinColumn(name="Articulo_idAlmacen", referencedColumnName="idAlmacen"),
			@JoinColumn(name="Articulo_idArticulo", referencedColumnName="idArticulo")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Actualizacion_idActualizacion", referencedColumnName="idActualizacion"),
			@JoinColumn(name="Actualizacion_idAlmacen", referencedColumnName="idAlmacen")
			}
		)
	private List<Actualizacion> actualizacions;

	//bi-directional many-to-one association to TipoArticulo
	@ManyToOne
	@JoinColumn(name="idTipoArticulo")
	private TipoArticulo tipoArticulo;

	//bi-directional many-to-one association to Almacen
	@ManyToOne
	@JoinColumn(name="idAlmacen")
	private Almacen almacen;

	//bi-directional many-to-many association to Promocion
	@ManyToMany
	@JoinTable(
		name="PromocionArticulo"
		, joinColumns={
			@JoinColumn(name="Articulo_idAlmacen", referencedColumnName="idAlmacen"),
			@JoinColumn(name="Articulo_idArticulo", referencedColumnName="idArticulo")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Promocion_idAlmacen", referencedColumnName="idAlmacen"),
			@JoinColumn(name="Promocion_idPromocion", referencedColumnName="idPromocion")
			}
		)
	private List<Promocion> promocions;

	public Articulo() {
	}

	public ArticuloPK getId() {
		return this.id;
	}

	public void setId(ArticuloPK id) {
		this.id = id;
	}

	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getNombreArticulo() {
		return this.nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public List<Actualizacion> getActualizacions() {
		return this.actualizacions;
	}

	public void setActualizacions(List<Actualizacion> actualizacions) {
		this.actualizacions = actualizacions;
	}

	public TipoArticulo getTipoArticulo() {
		return this.tipoArticulo;
	}

	public void setTipoArticulo(TipoArticulo tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	public Almacen getAlmacen() {
		return this.almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public List<Promocion> getPromocions() {
		return this.promocions;
	}

	public void setPromocions(List<Promocion> promocions) {
		this.promocions = promocions;
	}

}