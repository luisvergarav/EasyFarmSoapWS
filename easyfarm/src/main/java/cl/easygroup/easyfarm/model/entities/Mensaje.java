package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Mensaje database table.
 * 
 */
@Entity
@NamedQuery(name="Mensaje.findAll", query="SELECT m FROM Mensaje m")
public class Mensaje extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MensajePK id;

	private String texto;

	//bi-directional many-to-one association to TipoMensaje
	@ManyToOne
	@JoinColumn(name="idTipoMensaje")
	private TipoMensaje tipoMensaje;

	//bi-directional many-to-one association to Almacen
	@ManyToOne
	@JoinColumn(name="idAlmacen")
	private Almacen almacen;

	public Mensaje() {
	}

	public MensajePK getId() {
		return this.id;
	}

	public void setId(MensajePK id) {
		this.id = id;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public TipoMensaje getTipoMensaje() {
		return this.tipoMensaje;
	}

	public void setTipoMensaje(TipoMensaje tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	public Almacen getAlmacen() {
		return this.almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

}