package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the TipoAlmacen database table.
 * 
 */
@Entity
@NamedQuery(name="TipoAlmacen.findAll", query="SELECT t FROM TipoAlmacen t")
@Table(name="TipoAlmacen")
public class TipoAlmacen extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoAlmacen;

	private String descripcion;

	//bi-directional many-to-one association to Almacen
	@OneToMany(mappedBy="tipoAlmacenBean")
	private List<Almacen> almacens;

	public TipoAlmacen() {
	}

	public int getIdTipoAlmacen() {
		return this.idTipoAlmacen;
	}

	public void setIdTipoAlmacen(int idTipoAlmacen) {
		this.idTipoAlmacen = idTipoAlmacen;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Almacen> getAlmacens() {
		return this.almacens;
	}

	public void setAlmacens(List<Almacen> almacens) {
		this.almacens = almacens;
	}

	public Almacen addAlmacen(Almacen almacen) {
		getAlmacens().add(almacen);
		almacen.setTipoAlmacenBean(this);

		return almacen;
	}

	public Almacen removeAlmacen(Almacen almacen) {
		getAlmacens().remove(almacen);
		almacen.setTipoAlmacenBean(null);

		return almacen;
	}

}