package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the TipoMensaje database table.
 * 
 */
@Entity
@NamedQuery(name="TipoMensaje.findAll", query="SELECT t FROM TipoMensaje t")
public class TipoMensaje extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoMensaje;

	private String descripcion;

	//bi-directional many-to-one association to Mensaje
	@OneToMany(mappedBy="tipoMensaje")
	private List<Mensaje> mensajes;

	public TipoMensaje() {
	}

	public int getIdTipoMensaje() {
		return this.idTipoMensaje;
	}

	public void setIdTipoMensaje(int idTipoMensaje) {
		this.idTipoMensaje = idTipoMensaje;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Mensaje> getMensajes() {
		return this.mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public Mensaje addMensaje(Mensaje mensaje) {
		getMensajes().add(mensaje);
		mensaje.setTipoMensaje(this);

		return mensaje;
	}

	public Mensaje removeMensaje(Mensaje mensaje) {
		getMensajes().remove(mensaje);
		mensaje.setTipoMensaje(null);

		return mensaje;
	}

}