package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the Ubicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Ubicacion.findAll", query="SELECT u FROM Ubicacion u")
@Table(name="Ubicacion")
public class Ubicacion extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Ubicacion_ID")
	private int ubicacion_ID;

	private String calle;

	private String ciudad;

	private String comuna;

	private String latitud;

	private String longitud;

	private int numeroCalle;

	@Column(name="Region")
	private String region;

	//bi-directional many-to-one association to Almacen
	@OneToMany(mappedBy="ubicacion")
	private List<Almacen> almacens;

	//bi-directional many-to-one association to Almacen
	@ManyToOne
	@JoinColumn(name="idAlmacen")
	private Almacen almacen;

	public Ubicacion() {
	}

	public int getUbicacion_ID() {
		return this.ubicacion_ID;
	}

	public void setUbicacion_ID(int ubicacion_ID) {
		this.ubicacion_ID = ubicacion_ID;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getComuna() {
		return this.comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public int getNumeroCalle() {
		return this.numeroCalle;
	}

	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<Almacen> getAlmacens() {
		return this.almacens;
	}

	public void setAlmacens(List<Almacen> almacens) {
		this.almacens = almacens;
	}

	public Almacen addAlmacen(Almacen almacen) {
		getAlmacens().add(almacen);
		almacen.setUbicacion(this);

		return almacen;
	}

	public Almacen removeAlmacen(Almacen almacen) {
		getAlmacens().remove(almacen);
		almacen.setUbicacion(null);

		return almacen;
	}

	public Almacen getAlmacen() {
		return this.almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

}