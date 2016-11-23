package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the Ciudad database table.
 * 
 */
@Entity
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CiudadPK id;

	@Column(name="Descripcion")
	private String descripcion;

	//bi-directional many-to-one association to Region
	@ManyToOne
	@JoinColumn(name="idRegion")
	private Region region;

	//bi-directional many-to-one association to Comuna
	@OneToMany(mappedBy="ciudad")
	private List<Comuna> comunas;

	public Ciudad() {
	}

	public CiudadPK getId() {
		return this.id;
	}

	public void setId(CiudadPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Comuna> getComunas() {
		return this.comunas;
	}

	public void setComunas(List<Comuna> comunas) {
		this.comunas = comunas;
	}

	public Comuna addComuna(Comuna comuna) {
		getComunas().add(comuna);
		comuna.setCiudad(this);

		return comuna;
	}

	public Comuna removeComuna(Comuna comuna) {
		getComunas().remove(comuna);
		comuna.setCiudad(null);

		return comuna;
	}

}