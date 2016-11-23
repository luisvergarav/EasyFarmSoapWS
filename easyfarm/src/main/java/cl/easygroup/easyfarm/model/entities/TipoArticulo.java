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
 * The persistent class for the TipoArticulo database table.
 * 
 */
@Entity
@Table(name="TipoArticulo")
@NamedQuery(name="TipoArticulo.findAll", query="SELECT t FROM TipoArticulo t")
public class TipoArticulo extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoArticulo;

	private String descripcion;

	//bi-directional many-to-one association to Articulo
	@OneToMany(mappedBy="tipoArticulo")
	private List<Articulo> articulos;

	public TipoArticulo() {
	}

	public int getIdTipoArticulo() {
		return this.idTipoArticulo;
	}

	public void setIdTipoArticulo(int idTipoArticulo) {
		this.idTipoArticulo = idTipoArticulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Articulo addArticulo(Articulo articulo) {
		getArticulos().add(articulo);
		articulo.setTipoArticulo(this);

		return articulo;
	}

	public Articulo removeArticulo(Articulo articulo) {
		getArticulos().remove(articulo);
		articulo.setTipoArticulo(null);

		return articulo;
	}

}