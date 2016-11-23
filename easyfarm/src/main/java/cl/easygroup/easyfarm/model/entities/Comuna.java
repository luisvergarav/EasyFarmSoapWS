package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the Comuna database table.
 * 
 */
@Entity
@NamedQuery(name="Comuna.findAll", query="SELECT c FROM Comuna c")
public class Comuna extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComunaPK id;

	@Column(name="Descripcion")
	private String descripcion;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="idCiudad", referencedColumnName="idCiudad"),
		@JoinColumn(name="idRegion", referencedColumnName="idRegion")
		})
	private Ciudad ciudad;

	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="comuna")
	private List<Direccion> direccions;

	public Comuna() {
	}

	public ComunaPK getId() {
		return this.id;
	}

	public void setId(ComunaPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setComuna(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setComuna(null);

		return direccion;
	}

}