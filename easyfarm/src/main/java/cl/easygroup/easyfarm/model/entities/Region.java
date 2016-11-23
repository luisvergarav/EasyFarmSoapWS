package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the Region database table.
 * 
 */
@Entity
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRegion;

	@Column(name="Descripcion")
	private String descripcion;

	//bi-directional many-to-one association to Ciudad
	@OneToMany(mappedBy="region")
	private List<Ciudad> ciudads;

	public Region() {
	}

	public int getIdRegion() {
		return this.idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Ciudad> getCiudads() {
		return this.ciudads;
	}

	public void setCiudads(List<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}

	public Ciudad addCiudad(Ciudad ciudad) {
		getCiudads().add(ciudad);
		ciudad.setRegion(this);

		return ciudad;
	}

	public Ciudad removeCiudad(Ciudad ciudad) {
		getCiudads().remove(ciudad);
		ciudad.setRegion(null);

		return ciudad;
	}

}