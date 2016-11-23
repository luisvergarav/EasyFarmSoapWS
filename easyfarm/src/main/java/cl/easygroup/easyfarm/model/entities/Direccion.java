package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Direccion database table.
 * 
 */
@Entity
@NamedQuery(name="Direccion.findAll", query="SELECT d FROM Direccion d")
@Table(name="Direccion")
public class Direccion extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DireccionPK id;

	private String calle;

	private int latitud;

	private int longitud;

	private int numeroCalle;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Comuna
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="idCiudad", referencedColumnName="idCiudad"),
		@JoinColumn(name="idComuna", referencedColumnName="idComuna"),
		@JoinColumn(name="idRegion", referencedColumnName="idRegion")
		})
	private Comuna comuna;

	public Direccion() {
	}

	public DireccionPK getId() {
		return this.id;
	}

	public void setId(DireccionPK id) {
		this.id = id;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getLatitud() {
		return this.latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	public int getLongitud() {
		return this.longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getNumeroCalle() {
		return this.numeroCalle;
	}

	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Comuna getComuna() {
		return this.comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

}